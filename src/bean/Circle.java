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
public class Circle {
    private int circleId;
    private String circleContent;
    private String circlePic;
    private Timestamp circleTime;

    @Id
    @Column(name = "circle_id", nullable = false)
    public int getCircleId() {
        return circleId;
    }

    public void setCircleId(int circleId) {
        this.circleId = circleId;
    }

    @Basic
    @Column(name = "circle_content", nullable = true, length = 200)
    public String getCircleContent() {
        return circleContent;
    }

    public void setCircleContent(String circleContent) {
        this.circleContent = circleContent;
    }

    @Basic
    @Column(name = "circle_pic", nullable = true, length = 500)
    public String getCirclePic() {
        return circlePic;
    }

    public void setCirclePic(String circlePic) {
        this.circlePic = circlePic;
    }

    @Basic
    @Column(name = "circle_time", nullable = true)
    public Timestamp getCircleTime() {
        return circleTime;
    }

    public void setCircleTime(Timestamp circleTime) {
        this.circleTime = circleTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (circleId != circle.circleId) return false;
        if (circleContent != null ? !circleContent.equals(circle.circleContent) : circle.circleContent != null)
            return false;
        if (circlePic != null ? !circlePic.equals(circle.circlePic) : circle.circlePic != null) return false;
        if (circleTime != null ? !circleTime.equals(circle.circleTime) : circle.circleTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = circleId;
        result = 31 * result + (circleContent != null ? circleContent.hashCode() : 0);
        result = 31 * result + (circlePic != null ? circlePic.hashCode() : 0);
        result = 31 * result + (circleTime != null ? circleTime.hashCode() : 0);
        return result;
    }
}
