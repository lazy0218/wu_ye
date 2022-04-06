package A1.Space.mapper;

import A1.Space.domain.Carport;
import A1.Space.vo.CarPortVO;

import java.util.List;

/**
 * @author ruson
 * @description 针对表【space_carport(车库)】的数据库操作Mapper
 * @createDate 2022-03-24 22:49:43
 * @Entity A1.Space.domain.Carport
 */
public interface CarportMapper {
    List<CarPortVO> selectAll();

    List<CarPortVO> selectAllByParkingIdCarPortVos(int id);

    int deleteByPrimaryKey(Long id);

    int insert(Carport record);

    int insertSelective(Carport record);

    Carport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Carport record);

    int updateByPrimaryKey(Carport record);

}
