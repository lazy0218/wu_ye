package A1.Space.mapper;

import A1.Space.domain.Car;
import A1.Space.vo.CarVO;

import java.util.List;

/**
 * @author ruson
 * @description 针对表【space_car(汽车)】的数据库操作Mapper
 * @createDate 2022-03-24 22:50:44
 * @Entity A1.Space.domain.Car
 */
public interface CarMapper {
    List<CarVO> selectAll();

    int deleteByPrimaryKey(Long id);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

}
