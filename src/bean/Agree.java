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
public class Agree {
    private int agreeId;
    private Timestamp agreeTime;

    @Id
    @Column(name = "agree_id", nullable = false)
    public int getAgreeId() {
        return agreeId;
    }

    public void setAgreeId(int agreeId) {
        this.agreeId = agreeId;
    }

    @Basic
    @Column(name = "agree_time", nullable = true)
    public Timestamp getAgreeTime() {
        return agreeTime;
    }

    public void setAgreeTime(Timestamp agreeTime) {
        this.agreeTime = agreeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Agree agree = (Agree) o;

        if (agreeId != agree.agreeId) return false;
        if (agreeTime != null ? !agreeTime.equals(agree.agreeTime) : agree.agreeTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = agreeId;
        result = 31 * result + (agreeTime != null ? agreeTime.hashCode() : 0);
        return result;
    }
}
