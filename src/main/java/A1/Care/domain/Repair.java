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
    private LocalDateTime createTime;

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Boolean getHandle() {
        return isHandle;
    }

    public void setHandle(Boolean handle) {
        isHandle = handle;
    }

    public Boolean getPay() {
        return isPay;
    }

    public void setPay(Boolean pay) {
        isPay = pay;
    }

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
    public void setAppointment(String appointmentStr) {
        this.appointment = LocalDateTime.parse(appointmentStr.replace(" ", "T"));
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