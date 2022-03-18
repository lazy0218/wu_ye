package A1.Care.mapper;

import A1.Care.domain.RepairType;

import java.util.List;

/**
* @author ruson
* @description 针对表【customer_care_repair_type(报事类目设置)】的数据库操作Mapper
* @createDate 2022-03-16 14:14:31
* @Entity A1.Care.domain.RepairType
*/
public interface RepairTypeMapper {
    List<RepairType> selectAll();

    int deleteByPrimaryKey(Long id);

    int insert(RepairType record);

    int insertSelective(RepairType record);

    RepairType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RepairType record);

    int updateByPrimaryKey(RepairType record);

}
