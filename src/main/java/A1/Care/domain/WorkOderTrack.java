package A1.Care.domain;

import java.io.Serializable;

/**
 * 工单追踪
 * @TableName customer_care_work_oder_track
 */
public class WorkOderTrack implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 维修订单ID
     */
    private Integer repairId;

    /**
     * 操作人ID
     */
    private Integer operateUserId;

    /**
     * 描述
     */
    private String detailedDescription;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 维修订单ID
     */
    public Integer getRepairId() {
        return repairId;
    }

    /**
     * 维修订单ID
     */
    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    /**
     * 操作人ID
     */
    public Integer getOperateUserId() {
        return operateUserId;
    }

    /**
     * 操作人ID
     */
    public void setOperateUserId(Integer operateUserId) {
        this.operateUserId = operateUserId;
    }


    /**
     * 描述
     */
    public String getDetailedDescription() {
        return detailedDescription;
    }

    /**
     * 描述
     */
    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "WorkOderTrack{" +
                "id=" + id +
                ", repairId=" + repairId +
                ", operateUserId=" + operateUserId +
                ", detailedDescription='" + detailedDescription + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}