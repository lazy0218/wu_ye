package A1.User.domain;

import com.aliyun.dingtalkcontact_1_0.models.GetUserResponse;

import java.io.Serializable;

/**
 * 
 * @TableName user_user
 */
public class User implements Serializable {

    private Long id;
    private String avatarUrl;
    private String corpId;
    private String dingOpenid;
    private String email;
    private String mobile;
    private String name;
    private String password;
    private String sourceFrom;
    private String wxOpenid;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private static final long serialVersionUID = 1L;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getAvatarUrl() {
        return avatarUrl;
    }


    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }


    public String getCorpId() {
        return corpId;
    }


    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }


    public String getDingOpenid() {
        return dingOpenid;
    }


    public void setDingOpenid(String dingOpenid) {
        this.dingOpenid = dingOpenid;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getMobile() {
        return mobile;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getSourceFrom() {
        return sourceFrom;
    }


    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
    }


    public String getWxOpenid() {
        return wxOpenid;
    }


    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }
    public User(GetUserResponse userResponse)
    {
        this.name = userResponse.body.nick;
        this.mobile = userResponse.body.mobile;
        this.avatarUrl = userResponse.body.avatarUrl;
        this.email = userResponse.body.email;
        this.sourceFrom = "ding";
        this.dingOpenid = userResponse.body.openId;
        this.corpId = userResponse.body.unionId;
    }
    public User()
    {

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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAvatarUrl() == null ? other.getAvatarUrl() == null : this.getAvatarUrl().equals(other.getAvatarUrl()))
            && (this.getCorpId() == null ? other.getCorpId() == null : this.getCorpId().equals(other.getCorpId()))
            && (this.getDingOpenid() == null ? other.getDingOpenid() == null : this.getDingOpenid().equals(other.getDingOpenid()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSourceFrom() == null ? other.getSourceFrom() == null : this.getSourceFrom().equals(other.getSourceFrom()))
            && (this.getWxOpenid() == null ? other.getWxOpenid() == null : this.getWxOpenid().equals(other.getWxOpenid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAvatarUrl() == null) ? 0 : getAvatarUrl().hashCode());
        result = prime * result + ((getCorpId() == null) ? 0 : getCorpId().hashCode());
        result = prime * result + ((getDingOpenid() == null) ? 0 : getDingOpenid().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSourceFrom() == null) ? 0 : getSourceFrom().hashCode());
        result = prime * result + ((getWxOpenid() == null) ? 0 : getWxOpenid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", corpId=").append(corpId);
        sb.append(", dingOpenid=").append(dingOpenid);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", sourceFrom=").append(sourceFrom);
        sb.append(", wxOpenid=").append(wxOpenid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}