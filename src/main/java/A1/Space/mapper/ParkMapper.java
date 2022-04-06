package A1.Space.mapper;

import A1.Space.domain.Park;
import A1.Space.vo.ParkVO;

import java.util.List;

/**
 * @author ruson
 * @description 针对表【space_park(车场)】的数据库操作Mapper
 * @createDate 2022-03-24 22:48:41
 * @Entity A1.Space.domain.Park
 */
public interface ParkMapper {
    List<ParkVO> selectAll();

    int deleteByPrimaryKey(Long id);

    int insert(Park record);

    int insertSelective(Park record);

    Park selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Park record);

    int updateByPrimaryKey(Park record);

}
