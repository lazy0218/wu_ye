package A1.Space.Controller;

import A1.AOP.Response.ResultData;
import A1.Space.domain.Build;
import A1.Space.mapper.BuildMapper;
import A1.Space.mapper.CommunityMapper;
import cn.dev33.satoken.stp.StpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Validated
@Api(tags = "资产管理")
@RestController
@RequestMapping("/api/space")
public class BuildController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    CommunityMapper communityMapper;
    @Resource
    BuildMapper buildMapper;

    @ApiOperation("查询所在小区所有楼栋")
    @GetMapping("/builds")
    public List<Build> getBuilds() {
        return buildMapper.findAllByCommunityIdBuilds(StpUtil.getLoginIdAsLong());
    }

    @ApiOperation("创建一栋楼")
    @PostMapping("/build")
    public Build post_build(@RequestBody Build build) {
        build.setCommunityId(communityMapper.selectAllByUserIdCommunity(StpUtil.getLoginIdAsLong()).getId());
        buildMapper.insert(build);
        return build;
    }

    @ApiOperation("删除楼栋")
    @DeleteMapping("/build")
    public void deleteHouse(@RequestParam Long buildId) {
        buildMapper.deleteByPrimaryKey(buildId);
    }

    @ApiOperation("修改楼栋信息")
    @PutMapping("/build")
    public ResultData<String> putBuild(@RequestBody Build build)
    {
        logger.debug(String.valueOf(build));
        buildMapper.updateByPrimaryKey(build);
        return ResultData.success("更新成功");
    }


}
