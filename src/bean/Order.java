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
public class Order {
    private int orderId;
    private Integer userId;
    private Integer camId;
    private Timestamp orderTime;
    private String orderSpot;
    private String orderMsg;
    private Integer orderPlan;
    private Integer orderState;

    @Id
    @Column(name = "order_id", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    @Column(name = "order_time", nullable = true)
    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    @Basic
    @Column(name = "order_spot", nullable = true, length = 30)
    public String getOrderSpot() {
        return orderSpot;
    }

    public void setOrderSpot(String orderSpot) {
        this.orderSpot = orderSpot;
    }

    @Basic
    @Column(name = "order_msg", nullable = true, length = 50)
    public String getOrderMsg() {
        return orderMsg;
    }

    public void setOrderMsg(String orderMsg) {
        this.orderMsg = orderMsg;
    }

    @Basic
    @Column(name = "order_plan", nullable = true)
    public Integer getOrderPlan() {
        return orderPlan;
    }

    public void setOrderPlan(Integer orderPlan) {
        this.orderPlan = orderPlan;
    }

    @Basic
    @Column(name = "order_state", nullable = true)
    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderId != order.orderId) return false;
        if (userId != null ? !userId.equals(order.userId) : order.userId != null) return false;
        if (camId != null ? !camId.equals(order.camId) : order.camId != null) return false;
        if (orderTime != null ? !orderTime.equals(order.orderTime) : order.orderTime != null) return false;
        if (orderSpot != null ? !orderSpot.equals(order.orderSpot) : order.orderSpot != null) return false;
        if (orderMsg != null ? !orderMsg.equals(order.orderMsg) : order.orderMsg != null) return false;
        if (orderPlan != null ? !orderPlan.equals(order.orderPlan) : order.orderPlan != null) return false;
        if (orderState != null ? !orderState.equals(order.orderState) : order.orderState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (camId != null ? camId.hashCode() : 0);
        result = 31 * result + (orderTime != null ? orderTime.hashCode() : 0);
        result = 31 * result + (orderSpot != null ? orderSpot.hashCode() : 0);
        result = 31 * result + (orderMsg != null ? orderMsg.hashCode() : 0);
        result = 31 * result + (orderPlan != null ? orderPlan.hashCode() : 0);
        result = 31 * result + (orderState != null ? orderState.hashCode() : 0);
        return result;
    }
}
