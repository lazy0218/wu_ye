package A1.Space.Controller;

import A1.AOP.Response.ResultData;
import A1.Space.domain.House;
import A1.Space.mapper.HouseMapper;
import A1.Space.vo.HouseVO;
import cn.dev33.satoken.stp.StpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Validated
@Api(tags = "资产")
@RestController
@RequestMapping("/api/space")
public class HouseCorotroller {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    HouseMapper houseMapper;

    @ApiOperation("获取指定楼栋的所有房屋信息")
    @SneakyThrows
    @GetMapping("/houses")
    public List<HouseVO> getHouses(@RequestParam(required = false) String buildId){
        List<HouseVO> houseVOS=null;
        if (buildId==null){
            houseVOS = houseMapper.selectAllByUserIdHouseVos(StpUtil.getLoginIdAsLong());
        }
        else{
            houseVOS = houseMapper.selectAllByBuildIdHouseVos(Long.valueOf(buildId));
        }
        logger.debug(String.valueOf(houseVOS));
        return houseVOS;
    }

    @ApiOperation("删除房屋")
    @DeleteMapping("/house")
    public ResultData<String> deleteHouse(@RequestParam String houseId) {
        houseMapper.deleteByPrimaryKey(Long.valueOf(houseId));
        return ResultData.success("删除成功");
    }

    @ApiOperation("批量创建房屋")
    @PostMapping("/houses")
    public ResultData<String> post_houses(@RequestBody House[] houses) {
        for (House house : houses) {
            houseMapper.insert(house);
        }
        return ResultData.success("");
    }

    @ApiOperation("修改房屋信息")
    @PutMapping("/house")
    public ResultData<String> putHouse(@RequestBody House house)
    {
        logger.debug(String.valueOf(house));
        houseMapper.updateByPrimaryKey(house);
        return ResultData.success("更新成功");
    }
}
