package A1.User.mapper;

import A1.User.domain.User;

import java.util.List;

/**
 * @author ruson
 * @description 针对表【user_user】的数据库操作Mapper
 * @createDate 2022-03-09 20:55:35
 * @Entity A1.User.domain.User
 */

public interface UserMapper {
    List<User> selectByRoleUsers();

    List<User> selectIsClient();

    List<User> searchAllByMobileUsers(String m);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectAllByDingOpenidUser(String openId);
}
