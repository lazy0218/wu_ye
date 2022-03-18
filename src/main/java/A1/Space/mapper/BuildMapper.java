package A1.Space.mapper;

import A1.Space.domain.Build;

import java.util.List;

/**
* @author ruson
* @description 针对表【space_build】的数据库操作Mapper
* @createDate 2022-03-10 14:29:43
* @Entity A1.Space.domain.Build
*/
public interface BuildMapper {
    List<Build> findAllByCommunityIdBuilds(Long id);

    int deleteByPrimaryKey(Long id);

    int insert(Build record);

    int insertSelective(Build record);

    Build selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Build record);

    int updateByPrimaryKey(Build record);

}
