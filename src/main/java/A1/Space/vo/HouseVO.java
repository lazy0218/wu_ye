package A1.Space.vo;

public class HouseVO {
    private Integer space_houseId;
    private Integer buildId;
    private Double constructionArea;
    private Integer floor;
    private Double floorFactor;
    private String houseNum;
    private String houseState;
    private String houseType;
    private Double setArea;
    private Double shareArea;
    private String standardAddress;
    private String unit;
    private Integer userId;
    private String buildName;

    public Integer getSpace_houseId() {
        return space_houseId;
    }

    public void setSpace_houseId(Integer space_houseId) {
        this.space_houseId = space_houseId;
    }

    public Integer getBuildId() {
        return buildId;
    }

    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    public Double getConstructionArea() {
        return constructionArea;
    }

    public void setConstructionArea(Double constructionArea) {
        this.constructionArea = constructionArea;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Double getFloorFactor() {
        return floorFactor;
    }

    public void setFloorFactor(Double floorFactor) {
        this.floorFactor = floorFactor;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getHouseState() {
        return houseState;
    }

    public void setHouseState(String houseState) {
        this.houseState = houseState;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public Double getSetArea() {
        return setArea;
    }

    public void setSetArea(Double setArea) {
        this.setArea = setArea;
    }

    public Double getShareArea() {
        return shareArea;
    }

    public void setShareArea(Double shareArea) {
        this.shareArea = shareArea;
    }

    public String getStandardAddress() {
        return standardAddress;
    }

    public void setStandardAddress(String standardAddress) {
        this.standardAddress = standardAddress;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    @Override
    public String toString() {
        return "HouseVO{" +
                "space_houseId=" + space_houseId +
                ", buildId=" + buildId +
                ", constructionArea=" + constructionArea +
                ", floor=" + floor +
                ", floorFactor=" + floorFactor +
                ", houseNum='" + houseNum + '\'' +
                ", houseState='" + houseState + '\'' +
                ", houseType='" + houseType + '\'' +
                ", setArea=" + setArea +
                ", shareArea=" + shareArea +
                ", standardAddress='" + standardAddress + '\'' +
                ", unit='" + unit + '\'' +
                ", userId=" + userId +
                ", buildName='" + buildName + '\'' +
                '}';
    }

    public HouseVO() {
    }
}
