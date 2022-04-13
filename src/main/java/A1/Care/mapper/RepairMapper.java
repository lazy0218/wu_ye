package A1.Care.mapper;

import A1.Care.domain.Repair;
import A1.Care.vo.RepairVo;

import java.util.List;

/**
* @author ruson
* @description 针对表【customer_care_repair(维修)】的数据库操作Mapper
* @createDate 2022-03-16 14:12:47
* @Entity A1.Care.domain.Repair
*/
public interface RepairMapper {
    List<RepairVo> selectAllByAssignedOrder();
    List<RepairVo> selectAllByProcessed();
    List<RepairVo> selectAllByUnpaid();

    List<RepairVo> selectAllBySuuecss();

    RepairVo selectAllByIdRepairVo(Long id);

    int deleteByPrimaryKey(Long id);

    int insert(Repair record);

    int insertSelective(Repair record);

    Repair selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);

}
