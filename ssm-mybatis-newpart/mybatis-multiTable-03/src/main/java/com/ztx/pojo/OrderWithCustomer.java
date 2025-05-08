package com.ztx.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderWithCustomer {
    private Integer id;
    private String orderNumber;
    private BigDecimal totalPrice;
    private Date createTime;
    private Customer customer;
    // getters 和 setters


    @Override
    public String toString() {
        return "OrderWithCustomer{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", totalPrice=" + totalPrice +
                ", createTime=" + createTime +
                ", customer=" + customer +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
