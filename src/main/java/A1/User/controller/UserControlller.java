package A1.User.controller;

import A1.Config.DingDing;
import A1.User.domain.User;
import A1.User.mapper.UserMapper;
import A1.User.service.DingLoginService;
import cn.dev33.satoken.stp.StpUtil;
import io.swagger.annotations.Api;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
@Api(tags="用户")
@Slf4j
@RestController
public class UserControlller {
    @Autowired
    DingDing ding;

    @Autowired
    DingLoginService dingLoginService;

    @Resource
    UserMapper userMapper;

    @SneakyThrows
    @GetMapping("/authorize")
    public void authorize(HttpServletResponse response) {
        String url = ding.getAuthorizeUrl() + "&response_type=code" +
                "&client_id=" + ding.getClientId() +
                "&redirect_uri=" + ding.getRedirectUrl() + "&prompt=consent" + "&scope=openid+corpid";
        log.info("授权url:{}", url);
        response.sendRedirect(url);
    }

    @SneakyThrows
    @ResponseBody
    @GetMapping("/oauth2/callback")
    public void callback(@RequestParam("authCode") String code, HttpServletResponse response) {
        try {
            User user = dingLoginService.DingLogin(code);
            if (user == null) {
                response.sendRedirect("/404");
            }
            assert user != null;
            StpUtil.login(user.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("/welcome");
    }

    @GetMapping("/api/currentUser")
    public User currentUser() {
        return userMapper.selectByPrimaryKey(StpUtil.getLoginIdAsLong());
    }
}
