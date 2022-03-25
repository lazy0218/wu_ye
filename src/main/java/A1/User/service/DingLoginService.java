package A1.User.service;

import A1.User.domain.DingGetUserInfo;
import A1.User.domain.User;
import A1.User.mapper.UserMapper;
import com.aliyun.dingtalkcontact_1_0.models.GetUserResponse;
import com.aliyun.dingtalkoauth2_1_0.models.GetUserTokenRequest;
import com.aliyun.dingtalkoauth2_1_0.models.GetUserTokenResponse;
import com.aliyun.teaopenapi.models.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DingLoginService {
    @Resource
    UserMapper userMapper;
    @Autowired
    DingGetUserInfo dingGetUserInfo;

    public static com.aliyun.dingtalkoauth2_1_0.Client createClient() throws Exception {
        Config config = new Config();
        config.protocol = "https";
        config.regionId = "central";
        return new com.aliyun.dingtalkoauth2_1_0.Client(config);
    }

    public User DingLogin(String authcode) throws Exception {
        com.aliyun.dingtalkoauth2_1_0.Client client = DingLoginService.createClient();
        GetUserTokenRequest getUserTokenRequest = new GetUserTokenRequest()
                .setClientId("dingjbyp6ttfg0ujtzrd")
                .setClientSecret("cJwPwL5djhn5nl-xG09w6SsRb-phdoGFfdVX0EMGS1moOnRAPffCUKvQpK-N_aTi")
                .setCode(authcode)
                .setGrantType("authorization_code");
        GetUserTokenResponse response = client.getUserToken(getUserTokenRequest);
        GetUserResponse userResponse = DingGetUserInfo.GetUserInfo(response.body.accessToken);
        User user = userMapper.selectAllByDingOpenidUser(userResponse.body.openId);
        if (user == null) {
            user = new User(userResponse);
            userMapper.insert(user);
        }
        return user;
    }
}
