package A1.Space.mapper;

import A1.Space.domain.Community;

/**
* @author ruson
* @description 针对表【space_community】的数据库操作Mapper
* @createDate 2022-03-10 12:14:33
* @Entity A1.Space.domain.Community
*/
public interface CommunityMapper {
    Community selectAllByUserIdCommunity(Long id);

    int deleteByPrimaryKey(Long id);

    int insert(Community record);

    int insertSelective(Community record);

    Community selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);

}
