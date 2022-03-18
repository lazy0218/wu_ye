package A1.Care.domain;

import java.io.Serializable;

/**
 * 报事类目设置
 * @TableName customer_care_repair_type
 */
public class RepairType implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 描述
     */
    private String detailedDescription;

    /**
     * 
     */
    private String name;

    /**
     * 是否是公共区域
     */
    private Boolean privateArea;

    /**
     * 建议价格
     */
    private String proposedPrice;

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
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
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
     * 建议价格
     */
    public String getProposedPrice() {
        return proposedPrice;
    }

    /**
     * 建议价格
     */
    public void setProposedPrice(String proposedPrice) {
        this.proposedPrice = proposedPrice;
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
        RepairType other = (RepairType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDetailedDescription() == null ? other.getDetailedDescription() == null : this.getDetailedDescription().equals(other.getDetailedDescription()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrivateArea() == null ? other.getPrivateArea() == null : this.getPrivateArea().equals(other.getPrivateArea()))
            && (this.getProposedPrice() == null ? other.getProposedPrice() == null : this.getProposedPrice().equals(other.getProposedPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDetailedDescription() == null) ? 0 : getDetailedDescription().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrivateArea() == null) ? 0 : getPrivateArea().hashCode());
        result = prime * result + ((getProposedPrice() == null) ? 0 : getProposedPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", detailedDescription=").append(detailedDescription);
        sb.append(", name=").append(name);
        sb.append(", privateArea=").append(privateArea);
        sb.append(", proposedPrice=").append(proposedPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}