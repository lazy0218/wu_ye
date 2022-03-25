package A1.Space.mapper;

import A1.Space.domain.House;
import A1.Space.vo.HouseVO;

import java.util.List;

/**
* @author ruson
* @description 针对表【space_house】的数据库操作Mapper
* @createDate 2022-03-10 16:03:20
* @Entity A1.Space.domain.House
*/
public interface HouseMapper {
    List<HouseVO> selectAllByUserIdHouseVos(Long userId);

    List<HouseVO> selectAllByBuildIdHouseVos(Long buildId);

    int deleteByPrimaryKey(Long id);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

}
