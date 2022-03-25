package A1.Space.Controller;

import A1.AOP.Response.ResultData;
import A1.Space.domain.Car;
import A1.Space.mapper.CarMapper;
import A1.Space.vo.CarVO;
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
public class CarController {
    @Resource
    CarMapper carMapper;


    @ApiOperation("查询汽车")
    @GetMapping("/cars")
    public List<CarVO> getCars() {
        return carMapper.selectAll();
    }

    @ApiOperation("添加汽车")
    @PostMapping("/car")
    public ResultData<String> addCar(@RequestBody Car car) {
        carMapper.insert(car);
        return ResultData.success("创建成功");
    }
}
