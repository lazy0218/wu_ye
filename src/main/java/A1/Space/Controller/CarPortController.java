package A1.Space.Controller;


import A1.AOP.Response.ResultData;
import A1.Space.domain.Carport;
import A1.Space.mapper.CarportMapper;
import A1.Space.vo.CarPortVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Validated
@Api(tags = "资产管理")
@RestController
@RequestMapping("/api/space")
public class CarPortController {
    @Resource
    CarportMapper carportMapper;

    @ApiOperation("查询车位")
    @GetMapping("/carports")
    public List<CarPortVO> getCarPorts() {
        return carportMapper.selectAll();
    }

    @ApiOperation("增加车位")
    @PostMapping("/carports")
    public ResultData<String> addCarports(@RequestBody Carport carport) {
        carportMapper.insert(carport);
        return ResultData.success("成功");
    }


}
