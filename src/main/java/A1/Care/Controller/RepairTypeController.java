package A1.Care.Controller;

import A1.Care.domain.RepairType;
import A1.Care.mapper.RepairTypeMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.beans.Transient;
import java.util.List;


@Api(tags = "报事报修")
@RestController
@RequestMapping("/api/repair")
public class RepairTypeController {
    @Resource
    RepairTypeMapper repairTypeMapper;

    @ApiOperation("查询报修报事类目设置")
    @GetMapping("/type")
    public List<RepairType> getRepairs()
    {
        return repairTypeMapper.selectAll();
    }

    @Transient
    @ApiOperation("增加报修报事类目设置")
    @PostMapping("/type")
    public List<RepairType> addRepairs(@RequestBody RepairType repairType)
    {
        repairTypeMapper.insert(repairType);
        return repairTypeMapper.selectAll();
    }
}
