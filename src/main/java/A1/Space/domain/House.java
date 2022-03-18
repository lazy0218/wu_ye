package A1.Space.domain;

import java.io.Serializable;

/**
 * @TableName space_house
 */
public class House implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private Integer buildId;

    /**
     * 建筑面积
     */
    private Double constructionArea;

    /**
     * 楼层
     */
    private Integer floor;

    /**
     *
     */
    private Double floorFactor;

    /**
     * 房号
     */
    private String houseNum;

    /**
     * 住宅 or 公寓 or 商铺
     */
    private String houseState;

    /**
     * 空置 or 已入住  or  已出租
     */
    private String houseType;

    /**
     * 实际面积
     */
    private Double setArea;

    /**
     * 公摊面积
     */
    private Double shareArea;

    /**
     *标准地址
     */
    private String standardAddress;

    /**
     *
     */
    private String unit;

    /**
     *
     */
    private Integer userId;

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
     *
     */
    public Integer getBuildId() {
        return buildId;
    }

    /**
     *
     */
    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    /**
     *
     */
    public Double getConstructionArea() {
        return constructionArea;
    }

    /**
     *
     */
    public void setConstructionArea(Double constructionArea) {
        this.constructionArea = constructionArea;
    }

    /**
     *
     */
    public Integer getFloor() {
        return floor;
    }

    /**
     *
     */
    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    /**
     *
     */
    public Double getFloorFactor() {
        return floorFactor;
    }

    /**
     *
     */
    public void setFloorFactor(Double floorFactor) {
        this.floorFactor = floorFactor;
    }

    /**
     *
     */
    public String getHouseNum() {
        return houseNum;
    }

    /**
     *
     */
    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    /**
     *
     */
    public String getHouseState() {
        return houseState;
    }

    /**
     *
     */
    public void setHouseState(String houseState) {
        this.houseState = houseState;
    }

    /**
     *
     */
    public String getHouseType() {
        return houseType;
    }

    /**
     *
     */
    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    /**
     *
     */
    public Double getSetArea() {
        return setArea;
    }

    /**
     *
     */
    public void setSetArea(Double setArea) {
        this.setArea = setArea;
    }

    /**
     *
     */
    public Double getShareArea() {
        return shareArea;
    }

    /**
     *
     */
    public void setShareArea(Double shareArea) {
        this.shareArea = shareArea;
    }

    /**
     *
     */
    public String getStandardAddress() {
        return standardAddress;
    }

    /**
     *
     */
    public void setStandardAddress(String standardAddress) {
        this.standardAddress = standardAddress;
    }

    /**
     *
     */
    public String getUnit() {
        return unit;
    }

    /**
     *
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     *
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
        House other = (House) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getBuildId() == null ? other.getBuildId() == null : this.getBuildId().equals(other.getBuildId()))
                && (this.getConstructionArea() == null ? other.getConstructionArea() == null : this.getConstructionArea().equals(other.getConstructionArea()))
                && (this.getFloor() == null ? other.getFloor() == null : this.getFloor().equals(other.getFloor()))
                && (this.getFloorFactor() == null ? other.getFloorFactor() == null : this.getFloorFactor().equals(other.getFloorFactor()))
                && (this.getHouseNum() == null ? other.getHouseNum() == null : this.getHouseNum().equals(other.getHouseNum()))
                && (this.getHouseState() == null ? other.getHouseState() == null : this.getHouseState().equals(other.getHouseState()))
                && (this.getHouseType() == null ? other.getHouseType() == null : this.getHouseType().equals(other.getHouseType()))
                && (this.getSetArea() == null ? other.getSetArea() == null : this.getSetArea().equals(other.getSetArea()))
                && (this.getShareArea() == null ? other.getShareArea() == null : this.getShareArea().equals(other.getShareArea()))
                && (this.getStandardAddress() == null ? other.getStandardAddress() == null : this.getStandardAddress().equals(other.getStandardAddress()))
                && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBuildId() == null) ? 0 : getBuildId().hashCode());
        result = prime * result + ((getConstructionArea() == null) ? 0 : getConstructionArea().hashCode());
        result = prime * result + ((getFloor() == null) ? 0 : getFloor().hashCode());
        result = prime * result + ((getFloorFactor() == null) ? 0 : getFloorFactor().hashCode());
        result = prime * result + ((getHouseNum() == null) ? 0 : getHouseNum().hashCode());
        result = prime * result + ((getHouseState() == null) ? 0 : getHouseState().hashCode());
        result = prime * result + ((getHouseType() == null) ? 0 : getHouseType().hashCode());
        result = prime * result + ((getSetArea() == null) ? 0 : getSetArea().hashCode());
        result = prime * result + ((getShareArea() == null) ? 0 : getShareArea().hashCode());
        result = prime * result + ((getStandardAddress() == null) ? 0 : getStandardAddress().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", buildId=").append(buildId);
        sb.append(", constructionArea=").append(constructionArea);
        sb.append(", floor=").append(floor);
        sb.append(", floorFactor=").append(floorFactor);
        sb.append(", houseNum=").append(houseNum);
        sb.append(", houseState=").append(houseState);
        sb.append(", houseType=").append(houseType);
        sb.append(", setArea=").append(setArea);
        sb.append(", shareArea=").append(shareArea);
        sb.append(", standardAddress=").append(standardAddress);
        sb.append(", unit=").append(unit);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}