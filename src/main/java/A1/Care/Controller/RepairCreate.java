package A1.Care.Controller;

import A1.Care.domain.Repair;
import A1.Care.domain.WorkOderTrack;
import A1.Care.mapper.RepairMapper;
import A1.Care.mapper.RepairTypeMapper;
import A1.Care.mapper.WorkOderTrackMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Slf4j
@Api(tags = "报事报修")
@RestController
@RequestMapping("/api/repair")
public class RepairCreate {
    @Resource
    RepairTypeMapper repairTypeMapper;
    @Resource
    RepairMapper repairMapper;
    @Resource
    WorkOderTrackMapper workOderTrackMapper;


    @ApiOperation("创建订单")
    @PostMapping("/post")
    public Repair addOrder(@RequestBody Repair repair) {
        repair.setIsHandle(false);
        repair.setIsPay(false);
        repair.setSourceFrom("电话登记");
        repair.setCreateTime(LocalDateTime.now());
        repairMapper.insert(repair);
        log.info(repair.toString());
        WorkOderTrack workOderTrack = new WorkOderTrack();

        workOderTrack.setRepairId(repair.getId());
        workOderTrack.setOperateUserId(Math.toIntExact(repair.getReportUserId()));
        workOderTrack.setDetailedDescription("创建了");
        workOderTrackMapper.insert(workOderTrack);
        return repair;
    }

    @ApiOperation("分派订单")
    @PostMapping("/dispatch")
    public Repair coroOrder(@RequestParam Long repairId, @RequestParam Integer userId, @RequestParam String remark) {
        Repair repair = repairMapper.selectByPrimaryKey(repairId);
        repair.setRepairUserId(userId);
        repairMapper.updateByPrimaryKeySelective(repair);
        WorkOderTrack workOderTrack = new WorkOderTrack();
        workOderTrack.setRepairId(Math.toIntExact(repairId));
        workOderTrack.setOperateUserId(1);
        workOderTrack.setDetailedDescription("派单了");
        workOderTrackMapper.insert(workOderTrack);
        return repair;
    }

    @ApiOperation("处理订单")
    @PostMapping("/handle")
    public Repair handleOrder(@RequestParam Long repairId, @RequestParam Double price, @RequestParam String remark,
                              @RequestParam Long userId) {
        Repair repair = repairMapper.selectByPrimaryKey(repairId);
        repair.setIsPay(false);
        repair.setIsHandle(true);
        repair.setPrice(BigDecimal.valueOf(price));
        repairMapper.updateByPrimaryKey(repair);
        WorkOderTrack workOderTrack = new WorkOderTrack();
        workOderTrack.setOperateUserId(Math.toIntExact(userId));
        workOderTrack.setRepairId(Math.toIntExact(repairId));
        workOderTrack.setDetailedDescription("处理了");
        workOderTrack.setRemark(remark);
        workOderTrackMapper.insert(workOderTrack);
        return repair;
    }


    @ApiOperation("订单评分 与支付")
    @PostMapping("/comment")
    public Repair comment(@RequestParam Long repairId, @RequestParam Long userId, @RequestParam String comment, @RequestParam Integer comment_leval) {
        val repair = repairMapper.selectByPrimaryKey(repairId);
        repair.setCommentLeval(comment_leval);
        repair.setIsPay(true);
        repair.setComment(comment);
        repairMapper.updateByPrimaryKey(repair);
        WorkOderTrack workOderTrack = new WorkOderTrack();
        workOderTrack.setRepairId(Math.toIntExact(repairId));
        workOderTrack.setOperateUserId(Math.toIntExact(userId));
        workOderTrack.setDetailedDescription("评价了");
        workOderTrack.setRemark("评价:" + comment);
        workOderTrackMapper.insert(workOderTrack);
        return repair;
    }

}
