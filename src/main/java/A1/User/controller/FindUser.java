package A1.User.controller;

import A1.Care.mapper.WorkOderTrackMapper;
import A1.User.domain.User;
import A1.User.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "用户")
@Slf4j
@RestController
public class FindUser {

    @Resource
    UserMapper userMapper;


    @ApiOperation("获取物业工作人员")
    @GetMapping("/api/propertyUser")
    public List<User> getPropertyUser()
    {
        return userMapper.selectByRoleUsers();
    }


}
