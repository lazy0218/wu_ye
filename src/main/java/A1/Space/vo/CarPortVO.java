package A1.Space.vo;

import java.math.BigDecimal;

public class CarPortVO {

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
    private String carParkName;

    /**
     * 所有者
     */
    private String userName;

    /**
     * 车位面积
     */
    private BigDecimal area;
    private String userAvatarUrl;
    private String userMobile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getCarportState() {
        return carportState;
    }

    public void setCarportState(Object carportState) {
        this.carportState = carportState;
    }

    public Object getCarportType() {
        return carportType;
    }

    public void setCarportType(Object carportType) {
        this.carportType = carportType;
    }

    public String getCarportNum() {
        return carportNum;
    }

    public void setCarportNum(String carportNum) {
        this.carportNum = carportNum;
    }

    public String getCarParkName() {
        return carParkName;
    }

    public void setCarParkName(String carParkName) {
        this.carParkName = carParkName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public String getUserAvatarUrl() {
        return userAvatarUrl;
    }

    public void setUserAvatarUrl(String userAvatarUrl) {
        this.userAvatarUrl = userAvatarUrl;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
}
