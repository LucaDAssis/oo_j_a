package entities;

import entitiesEnum.OrderStatus;

import java.util.Date;

public class Order {
    private Integer ID;
    private Date momento;
    private OrderStatus status;

    public Order(){
    }

    public Order(Integer ID, Date momento, OrderStatus status) {
        this.ID = ID;
        this.momento = momento;
        this.status = status;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", momento=" + momento +
                ", status=" + status +
                '}';
    }

}
