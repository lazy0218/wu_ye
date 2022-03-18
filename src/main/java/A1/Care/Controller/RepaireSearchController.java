package A1.Care.Controller;

import A1.Care.mapper.RepairMapper;
import A1.Care.mapper.RepairTypeMapper;
import A1.Care.vo.RepairVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "报事报修")
@RestController
@RequestMapping("/api/repair")
public class RepaireSearchController {
    @Resource
    RepairTypeMapper repairTypeMapper;
    @Resource
    RepairMapper repairMapper;


    @ApiOperation("查询待分配订单")
    @GetMapping("/assigned")
    public List<RepairVo> getassigned() {
        return repairMapper.selectAllByAssignedOrder();
    }

    @ApiOperation("未处理订单")
    @GetMapping("/processed")
    public List<RepairVo> getProcessed() {
        return repairMapper.selectAllByProcessed();
    }

    @ApiOperation("未支付")
    @GetMapping("/unpaid")
    public List<RepairVo> getUnpaid() {
        return repairMapper.selectAllByUnpaid();
    }
}
