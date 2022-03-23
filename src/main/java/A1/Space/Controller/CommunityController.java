package A1.Space.Controller;

import A1.Space.domain.Community;
import A1.Space.mapper.CommunityMapper;
import cn.dev33.satoken.stp.StpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Validated
@Api(tags = "资产管理")
@RestController
@RequestMapping("/api/space")
public class CommunityController {
    @Resource
    CommunityMapper communityMapper;

    @ApiOperation("查询小区信息")
    @SneakyThrows
    @GetMapping("/community")
    public Community getCommunity() {
        Community community=communityMapper.selectAllByUserIdCommunity(StpUtil.getLoginIdAsLong());
        System.out.println(community);
        return communityMapper.selectAllByUserIdCommunity(StpUtil.getLoginIdAsLong());
    }
}
