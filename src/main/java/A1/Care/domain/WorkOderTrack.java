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
     * 操作人
     */
    private String operateUser;

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
     * 操作人
     */
    public String getOperateUser() {
        return operateUser;
    }

    /**
     * 操作人
     */
    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
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
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WorkOderTrack other = (WorkOderTrack) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRepairId() == null ? other.getRepairId() == null : this.getRepairId().equals(other.getRepairId()))
            && (this.getOperateUserId() == null ? other.getOperateUserId() == null : this.getOperateUserId().equals(other.getOperateUserId()))
            && (this.getOperateUser() == null ? other.getOperateUser() == null : this.getOperateUser().equals(other.getOperateUser()))
            && (this.getDetailedDescription() == null ? other.getDetailedDescription() == null : this.getDetailedDescription().equals(other.getDetailedDescription()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRepairId() == null) ? 0 : getRepairId().hashCode());
        result = prime * result + ((getOperateUserId() == null) ? 0 : getOperateUserId().hashCode());
        result = prime * result + ((getOperateUser() == null) ? 0 : getOperateUser().hashCode());
        result = prime * result + ((getDetailedDescription() == null) ? 0 : getDetailedDescription().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", repairId=").append(repairId);
        sb.append(", operateUserId=").append(operateUserId);
        sb.append(", operateUser=").append(operateUser);
        sb.append(", detailedDescription=").append(detailedDescription);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}