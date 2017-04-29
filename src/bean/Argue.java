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
public class Argue {
    private int argueId;
    private String argueContent;
    private Timestamp agreeTime;

    @Id
    @Column(name = "argue_id", nullable = false)
    public int getArgueId() {
        return argueId;
    }

    public void setArgueId(int argueId) {
        this.argueId = argueId;
    }

    @Basic
    @Column(name = "argue_content", nullable = true, length = 100)
    public String getArgueContent() {
        return argueContent;
    }

    public void setArgueContent(String argueContent) {
        this.argueContent = argueContent;
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

        Argue argue = (Argue) o;

        if (argueId != argue.argueId) return false;
        if (argueContent != null ? !argueContent.equals(argue.argueContent) : argue.argueContent != null) return false;
        if (agreeTime != null ? !agreeTime.equals(argue.agreeTime) : argue.agreeTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = argueId;
        result = 31 * result + (argueContent != null ? argueContent.hashCode() : 0);
        result = 31 * result + (agreeTime != null ? agreeTime.hashCode() : 0);
        return result;
    }
}
