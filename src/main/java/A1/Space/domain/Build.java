package A1.Space.domain;

import java.io.Serializable;

/**
 * @TableName space_build
 */
public class Build implements Serializable {

    private Integer id;


    private String buildName;


    private Long communityId;


    private Integer endFloor;


    private Boolean isAirplane;


    private Boolean isElevator;


    private Boolean isUndergroundParkingLot;


    private String remark;


    private Integer startFloor;


    private Double totalArea;


    private Double totalHouses;

    private static final long serialVersionUID = 1L;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getBuildName() {
        return buildName;
    }


    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }


    public Long getCommunityId() {
        return communityId;
    }


    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }


    public Integer getEndFloor() {
        return endFloor;
    }


    public void setEndFloor(Integer endFloor) {
        this.endFloor = endFloor;
    }


    public Boolean getIsAirplane() {
        return isAirplane;
    }


    public void setIsAirplane(Boolean isAirplane) {
        this.isAirplane = isAirplane;
    }


    public Boolean getIsElevator() {
        return isElevator;
    }


    public void setIsElevator(Boolean isElevator) {
        this.isElevator = isElevator;
    }


    public Boolean getIsUndergroundParkingLot() {
        return isUndergroundParkingLot;
    }


    public void setIsUndergroundParkingLot(Boolean isUndergroundParkingLot) {
        this.isUndergroundParkingLot = isUndergroundParkingLot;
    }


    public String getRemark() {
        return remark;
    }


    public void setRemark(String remark) {
        this.remark = remark;
    }


    public Integer getStartFloor() {
        return startFloor;
    }


    public void setStartFloor(Integer startFloor) {
        this.startFloor = startFloor;
    }


    public Double getTotalArea() {
        return totalArea;
    }


    public void setTotalArea(Double totalArea) {
        this.totalArea = totalArea;
    }


    public Double getTotalHouses() {
        return totalHouses;
    }


    public void setTotalHouses(Double totalHouses) {
        this.totalHouses = totalHouses;
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
        Build other = (Build) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getBuildName() == null ? other.getBuildName() == null : this.getBuildName().equals(other.getBuildName()))
                && (this.getCommunityId() == null ? other.getCommunityId() == null : this.getCommunityId().equals(other.getCommunityId()))
                && (this.getEndFloor() == null ? other.getEndFloor() == null : this.getEndFloor().equals(other.getEndFloor()))
                && (this.getIsAirplane() == null ? other.getIsAirplane() == null : this.getIsAirplane().equals(other.getIsAirplane()))
                && (this.getIsElevator() == null ? other.getIsElevator() == null : this.getIsElevator().equals(other.getIsElevator()))
                && (this.getIsUndergroundParkingLot() == null ? other.getIsUndergroundParkingLot() == null : this.getIsUndergroundParkingLot().equals(other.getIsUndergroundParkingLot()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getStartFloor() == null ? other.getStartFloor() == null : this.getStartFloor().equals(other.getStartFloor()))
                && (this.getTotalArea() == null ? other.getTotalArea() == null : this.getTotalArea().equals(other.getTotalArea()))
                && (this.getTotalHouses() == null ? other.getTotalHouses() == null : this.getTotalHouses().equals(other.getTotalHouses()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBuildName() == null) ? 0 : getBuildName().hashCode());
        result = prime * result + ((getCommunityId() == null) ? 0 : getCommunityId().hashCode());
        result = prime * result + ((getEndFloor() == null) ? 0 : getEndFloor().hashCode());
        result = prime * result + ((getIsAirplane() == null) ? 0 : getIsAirplane().hashCode());
        result = prime * result + ((getIsElevator() == null) ? 0 : getIsElevator().hashCode());
        result = prime * result + ((getIsUndergroundParkingLot() == null) ? 0 : getIsUndergroundParkingLot().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStartFloor() == null) ? 0 : getStartFloor().hashCode());
        result = prime * result + ((getTotalArea() == null) ? 0 : getTotalArea().hashCode());
        result = prime * result + ((getTotalHouses() == null) ? 0 : getTotalHouses().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", buildName=").append(buildName);
        sb.append(", communityId=").append(communityId);
        sb.append(", endFloor=").append(endFloor);
        sb.append(", isAirplane=").append(isAirplane);
        sb.append(", isElevator=").append(isElevator);
        sb.append(", isUndergroundParkingLot=").append(isUndergroundParkingLot);
        sb.append(", remark=").append(remark);
        sb.append(", startFloor=").append(startFloor);
        sb.append(", totalArea=").append(totalArea);
        sb.append(", totalHouses=").append(totalHouses);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}