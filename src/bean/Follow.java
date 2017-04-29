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
public class Follow {
    private int followId;
    private Integer followUser;
    private Timestamp followTime;

    @Id
    @Column(name = "follow_id", nullable = false)
    public int getFollowId() {
        return followId;
    }

    public void setFollowId(int followId) {
        this.followId = followId;
    }

    @Basic
    @Column(name = "follow_user", nullable = true)
    public Integer getFollowUser() {
        return followUser;
    }

    public void setFollowUser(Integer followUser) {
        this.followUser = followUser;
    }

    @Basic
    @Column(name = "follow_time", nullable = true)
    public Timestamp getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Timestamp followTime) {
        this.followTime = followTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Follow follow = (Follow) o;

        if (followId != follow.followId) return false;
        if (followUser != null ? !followUser.equals(follow.followUser) : follow.followUser != null) return false;
        if (followTime != null ? !followTime.equals(follow.followTime) : follow.followTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = followId;
        result = 31 * result + (followUser != null ? followUser.hashCode() : 0);
        result = 31 * result + (followTime != null ? followTime.hashCode() : 0);
        return result;
    }
}
