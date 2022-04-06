package A1.Care.mapper;

import A1.Care.domain.WorkOderTrack;
import A1.Care.vo.WorkOrderVo;

import java.util.List;

/**
* @author ruson
* @description 针对表【customer_care_work_oder_track(工单追踪)】的数据库操作Mapper
* @createDate 2022-03-16 14:31:59
* @Entity A1.Care.domain.WorkOderTrack
*/
public interface WorkOderTrackMapper {
    List<WorkOrderVo> searchAllByRepairIdWorkOrderVo(Long id);

    List<WorkOrderVo> getAllByTime();

    int deleteByPrimaryKey(Long id);

    int insert(WorkOderTrack record);

    int insertSelective(WorkOderTrack record);

    WorkOderTrack selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WorkOderTrack record);

    int updateByPrimaryKey(WorkOderTrack record);

}
