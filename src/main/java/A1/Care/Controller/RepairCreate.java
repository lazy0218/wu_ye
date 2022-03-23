package A1.Care.Controller;

import A1.Care.domain.Repair;
import A1.Care.domain.WorkOderTrack;
import A1.Care.mapper.RepairMapper;
import A1.Care.mapper.RepairTypeMapper;
import A1.Care.mapper.WorkOderTrackMapper;
import cn.dev33.satoken.stp.StpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.val;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;

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
        repairMapper.insert(repair);
        return repair;
    }

    @ApiOperation("分派订单")
    @PostMapping("/dispatch")
    public Repair coroOrder(@RequestParam Long repairId, @RequestParam Integer userId, @RequestParam Integer operUserId) {
        Repair repair = repairMapper.selectByPrimaryKey(repairId);
        repair.setRepairUserId(userId);
        repairMapper.updateByPrimaryKeySelective(repair);
        WorkOderTrack workOderTrack = new WorkOderTrack();
        workOderTrack.setRepairId(Math.toIntExact(repairId));
        workOderTrack.setOperateUserId(operUserId);
        workOderTrack.setDetailedDescription("已派单");
        workOderTrackMapper.insert(workOderTrack);
        return repair;
    }

    @ApiOperation("处理订单")
    @PostMapping("/handle")
    public Repair handleOrder(@RequestParam Long repairId, @RequestParam Double price, @RequestParam String remark) {
        Repair repair = repairMapper.selectByPrimaryKey(repairId);
        repair.setIsPay(true);
        repair.setIsHandle(true);
        repair.setPrice(BigDecimal.valueOf(price));
        WorkOderTrack workOderTrack = new WorkOderTrack();
        workOderTrack.setOperateUserId(Math.toIntExact(StpUtil.getLoginIdAsLong()));
        workOderTrack.setDetailedDescription("已处理");
        workOderTrack.setRemark(remark);
        workOderTrackMapper.insert(workOderTrack);
        return repair;
    }

    @ApiOperation("订单评分")
    @PostMapping("/comment")
    public Repair comment(@RequestParam Long repairId, @RequestParam String comment, @RequestParam Integer comment_leval) {
        val repair = repairMapper.selectByPrimaryKey(repairId);
        repair.setCommentLeval(comment_leval);
        repair.setComment(comment);
        repairMapper.updateByPrimaryKey(repair);
        WorkOderTrack workOderTrack = new WorkOderTrack();
        workOderTrack.setDetailedDescription("客户已评价");
        workOderTrack.setRemark(comment);
        workOderTrackMapper.insert(workOderTrack);
        return repair;
    }

}
