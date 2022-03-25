package A1.Space.domain;

import java.io.Serializable;

/**
 * 汽车
 *
 * @TableName space_car
 */
public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Integer id;
    /**
     *
     */
    private Integer ownerid;
    /**
     *
     */
    private Long carportId;
    /**
     *
     */
    private Boolean isHouseholder;
    /**
     * 车牌号
     */
    private String licensePlate;
    /**
     * 汽车品牌
     */
    private String carBrand;

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
    public Integer getOwnerid() {
        return ownerid;
    }

    /**
     *
     */
    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    /**
     *
     */
    public Long getCarportId() {
        return carportId;
    }

    /**
     *
     */
    public void setCarportId(Long carportId) {
        this.carportId = carportId;
    }

    /**
     *
     */
    public Boolean getIsHouseholder() {
        return isHouseholder;
    }

    /**
     *
     */
    public void setIsHouseholder(Boolean isHouseholder) {
        this.isHouseholder = isHouseholder;
    }

    /**
     * 车牌号
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * 车牌号
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * 汽车品牌
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * 汽车品牌
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
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
        Car other = (Car) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getOwnerid() == null ? other.getOwnerid() == null : this.getOwnerid().equals(other.getOwnerid()))
                && (this.getCarportId() == null ? other.getCarportId() == null : this.getCarportId().equals(other.getCarportId()))
                && (this.getIsHouseholder() == null ? other.getIsHouseholder() == null : this.getIsHouseholder().equals(other.getIsHouseholder()))
                && (this.getLicensePlate() == null ? other.getLicensePlate() == null : this.getLicensePlate().equals(other.getLicensePlate()))
                && (this.getCarBrand() == null ? other.getCarBrand() == null : this.getCarBrand().equals(other.getCarBrand()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOwnerid() == null) ? 0 : getOwnerid().hashCode());
        result = prime * result + ((getCarportId() == null) ? 0 : getCarportId().hashCode());
        result = prime * result + ((getIsHouseholder() == null) ? 0 : getIsHouseholder().hashCode());
        result = prime * result + ((getLicensePlate() == null) ? 0 : getLicensePlate().hashCode());
        result = prime * result + ((getCarBrand() == null) ? 0 : getCarBrand().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ownerid=").append(ownerid);
        sb.append(", carportId=").append(carportId);
        sb.append(", isHouseholder=").append(isHouseholder);
        sb.append(", licensePlate=").append(licensePlate);
        sb.append(", carBrand=").append(carBrand);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}