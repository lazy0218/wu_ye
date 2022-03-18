package A1.Care.vo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RepairVo {
    public RepairVo(){

    }

    private Integer id;

    /**
     * 联系人
     */
    private String contactName;

    /**
     * 联系人手机号
     */
    private String phone;
    private String  reparirType;

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
    private String repairName;

    /**
     * 维修人
     */
    private String reportName;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReparirType() {
        return reparirType;
    }

    public void setReparirType(String reparirType) {
        this.reparirType = reparirType;
    }

    public Boolean getPrivateArea() {
        return privateArea;
    }

    public void setPrivateArea(Boolean privateArea) {
        this.privateArea = privateArea;
    }

    public LocalDateTime getAppointment() {
        return appointment;
    }

    public void setAppointment(LocalDateTime appointment) {
        this.appointment = appointment;
    }

    public Boolean getDuty() {
        return duty;
    }

    public void setDuty(Boolean duty) {
        this.duty = duty;
    }

    public Integer getEmergencyLevel() {
        return emergencyLevel;
    }

    public void setEmergencyLevel(Integer emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public Boolean getHandle() {
        return isHandle;
    }

    public void setHandle(Boolean handle) {
        isHandle = handle;
    }

    public String getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
    }

    public String getRepairName() {
        return repairName;
    }

    public void setRepairName(String repairName) {
        this.repairName = repairName;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCommentLeval() {
        return commentLeval;
    }

    public void setCommentLeval(Integer commentLeval) {
        this.commentLeval = commentLeval;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getPay() {
        return isPay;
    }

    public void setPay(Boolean pay) {
        isPay = pay;
    }
}
