package A1.Care.Controller;

import A1.Care.mapper.WorkOderTrackMapper;
import A1.Care.vo.WorkOrderVo;
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
public class WorkOrderTrackController {
    @Resource
    WorkOderTrackMapper workOderTrackMapper;

    @ApiOperation("获取动态")
    @GetMapping("/dynamic")
    public List<WorkOrderVo> getFiften() {
        return workOderTrackMapper.getAllByTime();
    }

}
