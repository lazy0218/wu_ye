package A1;

import A1.User.domain.User;
import A1.User.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
@SpringBootTest
public class UserTest {

    @Resource
    UserMapper userMapper;

    @Test
    public void test1(){
        User user = userMapper.selectAllByDingOpenidUser("cFzhqRJ9rfWGii3BZ2tFc9AiEiE");
        //User user=userMapper.selectByPrimaryKey(1L);
        System.out.println(user);
    }


}
