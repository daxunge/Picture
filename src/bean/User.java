package bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/29.
 */
@Entity
public class User {
    private int userId;
    private String userName;
    private String userPwd;
    private int userSex;
    private String userSign;
    private String userOverview;
    private String userMobile;
    private String userImg;
    private Integer userRole;
    private Timestamp userTime;
    private String userIp;

    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 30)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_pwd", nullable = false, length = 50)
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Basic
    @Column(name = "user_sex", nullable = false)
    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    @Basic
    @Column(name = "user_sign", nullable = true, length = 100)
    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    @Basic
    @Column(name = "user_overview", nullable = true, length = 500)
    public String getUserOverview() {
        return userOverview;
    }

    public void setUserOverview(String userOverview) {
        this.userOverview = userOverview;
    }

    @Basic
    @Column(name = "user_mobile", nullable = true, length = 20)
    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    @Basic
    @Column(name = "user_img", nullable = true, length = 100)
    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    @Basic
    @Column(name = "user_role", nullable = true)
    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    @Basic
    @Column(name = "user_time", nullable = true)
    public Timestamp getUserTime() {
        return userTime;
    }

    public void setUserTime(Timestamp userTime) {
        this.userTime = userTime;
    }

    @Basic
    @Column(name = "user_ip", nullable = true, length = 30)
    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (userSex != user.userSex) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (userPwd != null ? !userPwd.equals(user.userPwd) : user.userPwd != null) return false;
        if (userSign != null ? !userSign.equals(user.userSign) : user.userSign != null) return false;
        if (userOverview != null ? !userOverview.equals(user.userOverview) : user.userOverview != null) return false;
        if (userMobile != null ? !userMobile.equals(user.userMobile) : user.userMobile != null) return false;
        if (userImg != null ? !userImg.equals(user.userImg) : user.userImg != null) return false;
        if (userRole != null ? !userRole.equals(user.userRole) : user.userRole != null) return false;
        if (userTime != null ? !userTime.equals(user.userTime) : user.userTime != null) return false;
        if (userIp != null ? !userIp.equals(user.userIp) : user.userIp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPwd != null ? userPwd.hashCode() : 0);
        result = 31 * result + userSex;
        result = 31 * result + (userSign != null ? userSign.hashCode() : 0);
        result = 31 * result + (userOverview != null ? userOverview.hashCode() : 0);
        result = 31 * result + (userMobile != null ? userMobile.hashCode() : 0);
        result = 31 * result + (userImg != null ? userImg.hashCode() : 0);
        result = 31 * result + (userRole != null ? userRole.hashCode() : 0);
        result = 31 * result + (userTime != null ? userTime.hashCode() : 0);
        result = 31 * result + (userIp != null ? userIp.hashCode() : 0);
        return result;
    }
}
