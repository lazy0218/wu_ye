package A1.Care.Controller;

import A1.Care.mapper.RepairMapper;
import A1.Care.mapper.WorkOderTrackMapper;
import A1.Care.vo.RepairVo;
import A1.Care.vo.WorkOrderVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "报事报修")
@RestController
@RequestMapping("/api/repair")
public class RepairSingleSearch {

    @Resource
    RepairMapper repairMapper;
    @Resource
    WorkOderTrackMapper workOderTrackMapper;

    @ApiOperation("查询单个报事单")
    @GetMapping("/single")
    public RepairVo getSingle(@RequestParam Long  repairId){
        return  repairMapper.selectAllByIdRepairVo(repairId);
    }

    @ApiOperation("查询单个报试单流程")
    @GetMapping("/wot")
    public List<WorkOrderVo> getWOT(@RequestParam Long  repairId)
    {
        return workOderTrackMapper.searchAllByRepairIdWorkOrderVo(repairId);
    }
}
