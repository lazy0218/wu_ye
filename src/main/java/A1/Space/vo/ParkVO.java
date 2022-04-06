package A1.Space.vo;

public class ParkVO {
    private Integer id;
    private String carParkName;
    private Integer countCarport;
    private Integer unsale;
    private Integer commmunityId;

    public Integer getCommmunityId() {
        return commmunityId;
    }

    public void setCommmunityId(Integer commmunityId) {
        this.commmunityId = commmunityId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarParkName() {
        return carParkName;
    }

    public void setCarParkName(String carParkName) {
        this.carParkName = carParkName;
    }

    public Integer getCountCarport() {
        return countCarport;
    }

    public void setCountCarport(Integer countCarport) {
        this.countCarport = countCarport;
    }

    public Integer getUnsale() {
        return unsale;
    }

    public void setUnsale(Integer unsale) {
        this.unsale = unsale;
    }
}
