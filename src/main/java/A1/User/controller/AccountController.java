package A1.User.controller;

import A1.User.domain.User;
import A1.User.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "账户")
@Slf4j
@RestController
public class AccountController {

    @Resource
    UserMapper userMapper;

    @ApiOperation("获取物业工作人员")
    @GetMapping("/api/propertyUser")
    public List<User> getPropertyUser() {
        return userMapper.selectByRoleUsers();
    }

    @ApiOperation("获取客户信息")
    @GetMapping("/api/client")
    public List<User> getClient() {
        return userMapper.selectByRoleUsers();
    }

    @ApiOperation("通过手机号获取客户")
    @GetMapping("/api/mobile")
    public List<User> getMobile(@RequestParam(required = false) String m) {
        if (m == null) {
            return userMapper.selectByRoleUsers();
        }
        return userMapper.searchAllByMobileUsers(m);
    }

}
