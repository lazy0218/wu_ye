package A1.Space.domain;

import java.io.Serializable;

/**
 * 车场
 *
 * @TableName space_park
 */
public class Park implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Integer id;
    /**
     *
     */
    private String carParkName;
    /**
     * 社区号
     */
    private Integer commmunityId;

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
    public String getCarParkName() {
        return carParkName;
    }

    /**
     *
     */
    public void setCarParkName(String carParkName) {
        this.carParkName = carParkName;
    }

    /**
     * 社区号
     */
    public Integer getCommmunityId() {
        return commmunityId;
    }

    /**
     * 社区号
     */
    public void setCommmunityId(Integer commmunityId) {
        this.commmunityId = commmunityId;
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
        Park other = (Park) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCarParkName() == null ? other.getCarParkName() == null : this.getCarParkName().equals(other.getCarParkName()))
                && (this.getCommmunityId() == null ? other.getCommmunityId() == null : this.getCommmunityId().equals(other.getCommmunityId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCarParkName() == null) ? 0 : getCarParkName().hashCode());
        result = prime * result + ((getCommmunityId() == null) ? 0 : getCommmunityId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", carParkName=").append(carParkName);
        sb.append(", commmunityId=").append(commmunityId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}