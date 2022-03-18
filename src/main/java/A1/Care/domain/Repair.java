package A1.Care.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 维修
 * @TableName customer_care_repair
 */
public class Repair implements Serializable {
    public Repair(){

    }
    /**
     * ID
     */
    private Integer id;

    /**
     * 联系人
     */
    private String contactName;

    /**
     * 联系人手机号
     */
    private String phone;

    /**
     * 
     */
    private Integer repairTypeId;

    /**
     * 是否是公共区域
     */
    private Boolean privateArea;

    /**
     * 预约维修时间
     */
    private LocalDateTime appointment;

    /**
     * 责任
     */
    private Boolean duty;

    /**
     * 紧急程度1-3
     */
    private Integer emergencyLevel;

    /**
     * 描述
     */
    private String remark;

    /**
     * 
     */
    private Integer communityId;

    /**
     * 
     */
    private LocalDateTime createtime;

    /**
     * 是否已被处理
     */
    private Boolean isHandle;

    /**
     * 工单来源
     */
    private String sourceFrom;

    /**
     * 报告人
     */
    private Integer reportUserId;

    /**
     * 维修人
     */
    private Integer repairUserId;

    /**
     * 最后价格
     */
    private BigDecimal price;

    /**
     * 顾客服务评分1-10
     */
    private Integer commentLeval;

    /**
     * 顾客评价
     */
    private String comment;

    /**
     * 是否付款
     */
    private Boolean isPay;

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
     * 联系人
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 联系人
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * 联系人手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 联系人手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     */
    public Integer getRepairTypeId() {
        return repairTypeId;
    }

    /**
     * 
     */
    public void setRepairTypeId(Integer repairTypeId) {
        this.repairTypeId = repairTypeId;
    }

    /**
     * 是否是公共区域
     */
    public Boolean getPrivateArea() {
        return privateArea;
    }

    /**
     * 是否是公共区域
     */
    public void setPrivateArea(Boolean privateArea) {
        this.privateArea = privateArea;
    }

    /**
     * 预约维修时间
     */
    public LocalDateTime getAppointment() {
        return appointment;
    }

    /**
     * 预约维修时间
     */
    public void setAppointment(LocalDateTime appointment) {
        this.appointment = appointment;
    }

    /**
     * 责任
     */
    public Boolean getDuty() {
        return duty;
    }

    /**
     * 责任
     */
    public void setDuty(Boolean duty) {
        this.duty = duty;
    }

    /**
     * 紧急程度1-3
     */
    public Integer getEmergencyLevel() {
        return emergencyLevel;
    }

    /**
     * 紧急程度1-3
     */
    public void setEmergencyLevel(Integer emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }

    /**
     * 描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 
     */
    public Integer getCommunityId() {
        return communityId;
    }

    /**
     * 
     */
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    /**
     * 
     */
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    /**
     * 
     */
    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    /**
     * 是否已被处理
     */
    public Boolean getIsHandle() {
        return isHandle;
    }

    /**
     * 是否已被处理
     */
    public void setIsHandle(Boolean isHandle) {
        this.isHandle = isHandle;
    }

    /**
     * 工单来源
     */
    public String getSourceFrom() {
        return sourceFrom;
    }

    /**
     * 工单来源
     */
    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
    }

    /**
     * 报告人
     */
    public Integer getReportUserId() {
        return reportUserId;
    }

    /**
     * 报告人
     */
    public void setReportUserId(Integer reportUserId) {
        this.reportUserId = reportUserId;
    }

    /**
     * 维修人
     */
    public Integer getRepairUserId() {
        return repairUserId;
    }

    /**
     * 维修人
     */
    public void setRepairUserId(Integer repairUserId) {
        this.repairUserId = repairUserId;
    }

    /**
     * 最后价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 最后价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 顾客服务评分1-10
     */
    public Integer getCommentLeval() {
        return commentLeval;
    }

    /**
     * 顾客服务评分1-10
     */
    public void setCommentLeval(Integer commentLeval) {
        this.commentLeval = commentLeval;
    }

    /**
     * 顾客评价
     */
    public String getComment() {
        return comment;
    }

    /**
     * 顾客评价
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 是否付款
     */
    public Boolean getIsPay() {
        return isPay;
    }

    /**
     * 是否付款
     */
    public void setIsPay(Boolean isPay) {
        this.isPay = isPay;
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
        Repair other = (Repair) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContactName() == null ? other.getContactName() == null : this.getContactName().equals(other.getContactName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getRepairTypeId() == null ? other.getRepairTypeId() == null : this.getRepairTypeId().equals(other.getRepairTypeId()))
            && (this.getPrivateArea() == null ? other.getPrivateArea() == null : this.getPrivateArea().equals(other.getPrivateArea()))
            && (this.getAppointment() == null ? other.getAppointment() == null : this.getAppointment().equals(other.getAppointment()))
            && (this.getDuty() == null ? other.getDuty() == null : this.getDuty().equals(other.getDuty()))
            && (this.getEmergencyLevel() == null ? other.getEmergencyLevel() == null : this.getEmergencyLevel().equals(other.getEmergencyLevel()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCommunityId() == null ? other.getCommunityId() == null : this.getCommunityId().equals(other.getCommunityId()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getIsHandle() == null ? other.getIsHandle() == null : this.getIsHandle().equals(other.getIsHandle()))
            && (this.getSourceFrom() == null ? other.getSourceFrom() == null : this.getSourceFrom().equals(other.getSourceFrom()))
            && (this.getReportUserId() == null ? other.getReportUserId() == null : this.getReportUserId().equals(other.getReportUserId()))
            && (this.getRepairUserId() == null ? other.getRepairUserId() == null : this.getRepairUserId().equals(other.getRepairUserId()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getCommentLeval() == null ? other.getCommentLeval() == null : this.getCommentLeval().equals(other.getCommentLeval()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getIsPay() == null ? other.getIsPay() == null : this.getIsPay().equals(other.getIsPay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContactName() == null) ? 0 : getContactName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getRepairTypeId() == null) ? 0 : getRepairTypeId().hashCode());
        result = prime * result + ((getPrivateArea() == null) ? 0 : getPrivateArea().hashCode());
        result = prime * result + ((getAppointment() == null) ? 0 : getAppointment().hashCode());
        result = prime * result + ((getDuty() == null) ? 0 : getDuty().hashCode());
        result = prime * result + ((getEmergencyLevel() == null) ? 0 : getEmergencyLevel().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCommunityId() == null) ? 0 : getCommunityId().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getIsHandle() == null) ? 0 : getIsHandle().hashCode());
        result = prime * result + ((getSourceFrom() == null) ? 0 : getSourceFrom().hashCode());
        result = prime * result + ((getReportUserId() == null) ? 0 : getReportUserId().hashCode());
        result = prime * result + ((getRepairUserId() == null) ? 0 : getRepairUserId().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getCommentLeval() == null) ? 0 : getCommentLeval().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getIsPay() == null) ? 0 : getIsPay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", contactName=").append(contactName);
        sb.append(", phone=").append(phone);
        sb.append(", repairTypeId=").append(repairTypeId);
        sb.append(", privateArea=").append(privateArea);
        sb.append(", appointment=").append(appointment);
        sb.append(", duty=").append(duty);
        sb.append(", emergencyLevel=").append(emergencyLevel);
        sb.append(", remark=").append(remark);
        sb.append(", communityId=").append(communityId);
        sb.append(", createtime=").append(createtime);
        sb.append(", isHandle=").append(isHandle);
        sb.append(", sourceFrom=").append(sourceFrom);
        sb.append(", reportUserId=").append(reportUserId);
        sb.append(", repairUserId=").append(repairUserId);
        sb.append(", price=").append(price);
        sb.append(", commentLeval=").append(commentLeval);
        sb.append(", comment=").append(comment);
        sb.append(", isPay=").append(isPay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}