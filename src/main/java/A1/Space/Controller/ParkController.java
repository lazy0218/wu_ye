package A1.Space.Controller;

import A1.Space.domain.Park;
import A1.Space.mapper.ParkMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Validated
@Api(tags = "资产管理")
@RestController
@RequestMapping("/api/space")
public class ParkController {
    @Resource
    ParkMapper parkMapper;

    @ApiOperation("查询车场")
    @GetMapping("/parks")
    public List<Park> getParks() {
        return parkMapper.selectAll();
    }

}
