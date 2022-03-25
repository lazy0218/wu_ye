package A1.Space.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 车库
 *
 * @TableName space_carport
 */
public class Carport implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Integer id;
    /**
     * 使用状态
     */
    private Object carportState;
    /**
     * 产权归属
     */
    private Object carportType;
    /**
     * 车位号
     */
    private String carportNum;
    /**
     * 车厂号
     */
    private Long parkingId;
    /**
     * 所有者
     */
    private Long userId;
    /**
     * 车位面积
     */
    private BigDecimal area;

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
     * 使用状态
     */
    public Object getCarportState() {
        return carportState;
    }

    /**
     * 使用状态
     */
    public void setCarportState(Object carportState) {
        this.carportState = carportState;
    }

    /**
     * 产权归属
     */
    public Object getCarportType() {
        return carportType;
    }

    /**
     * 产权归属
     */
    public void setCarportType(Object carportType) {
        this.carportType = carportType;
    }

    /**
     * 车位号
     */
    public String getCarportNum() {
        return carportNum;
    }

    /**
     * 车位号
     */
    public void setCarportNum(String carportNum) {
        this.carportNum = carportNum;
    }

    /**
     * 车厂号
     */
    public Long getParkingId() {
        return parkingId;
    }

    /**
     * 车厂号
     */
    public void setParkingId(Long parkingId) {
        this.parkingId = parkingId;
    }

    /**
     * 所有者
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 所有者
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 车位面积
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * 车位面积
     */
    public void setArea(BigDecimal area) {
        this.area = area;
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
        Carport other = (Carport) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCarportState() == null ? other.getCarportState() == null : this.getCarportState().equals(other.getCarportState()))
                && (this.getCarportType() == null ? other.getCarportType() == null : this.getCarportType().equals(other.getCarportType()))
                && (this.getCarportNum() == null ? other.getCarportNum() == null : this.getCarportNum().equals(other.getCarportNum()))
                && (this.getParkingId() == null ? other.getParkingId() == null : this.getParkingId().equals(other.getParkingId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCarportState() == null) ? 0 : getCarportState().hashCode());
        result = prime * result + ((getCarportType() == null) ? 0 : getCarportType().hashCode());
        result = prime * result + ((getCarportNum() == null) ? 0 : getCarportNum().hashCode());
        result = prime * result + ((getParkingId() == null) ? 0 : getParkingId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", carportState=").append(carportState);
        sb.append(", carportType=").append(carportType);
        sb.append(", carportNum=").append(carportNum);
        sb.append(", parkingId=").append(parkingId);
        sb.append(", userId=").append(userId);
        sb.append(", area=").append(area);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}