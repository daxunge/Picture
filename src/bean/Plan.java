package bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/4/30.
 */
@Entity
public class Plan {
    private int planId;
    private Integer camId;
    private String planTitle;
    private String planContent;
    private String planPrice;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id", nullable = false)
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    @Basic
    @Column(name = "cam_id", nullable = true)
    public Integer getCamId() {
        return camId;
    }

    public void setCamId(Integer camId) {
        this.camId = camId;
    }

    @Basic
    @Column(name = "plan_title", nullable = true, length = 20)
    public String getPlanTitle() {
        return planTitle;
    }

    public void setPlanTitle(String planTitle) {
        this.planTitle = planTitle;
    }

    @Basic
    @Column(name = "plan_content", nullable = true, length = 50)
    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }

    @Basic
    @Column(name = "plan_price", nullable = true, length = 20)
    public String getPlanPrice() {
        return planPrice;
    }

    public void setPlanPrice(String planPrice) {
        this.planPrice = planPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plan plan = (Plan) o;

        if (planId != plan.planId) return false;
        if (camId != null ? !camId.equals(plan.camId) : plan.camId != null) return false;
        if (planTitle != null ? !planTitle.equals(plan.planTitle) : plan.planTitle != null) return false;
        if (planContent != null ? !planContent.equals(plan.planContent) : plan.planContent != null) return false;
        if (planPrice != null ? !planPrice.equals(plan.planPrice) : plan.planPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = planId;
        result = 31 * result + (camId != null ? camId.hashCode() : 0);
        result = 31 * result + (planTitle != null ? planTitle.hashCode() : 0);
        result = 31 * result + (planContent != null ? planContent.hashCode() : 0);
        result = 31 * result + (planPrice != null ? planPrice.hashCode() : 0);
        return result;
    }
}
