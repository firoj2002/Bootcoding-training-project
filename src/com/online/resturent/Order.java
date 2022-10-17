package com.online.resturent;

import java.awt.*;
import java.util.Date;
    public class Order {
            public double getTotalAmount() {
                    return totalAmount;
            }

            public void setTotalAmount(double totalAmount) {
                    this.totalAmount = totalAmount;
            }

            public Vendor getVendor() {
                    return vendor;
            }

            public void setVendor(Vendor vendor) {
                    this.vendor = vendor;
            }

            public Customer getCustomer() {
                    return customer;
            }

            public void setCustomer(Customer customer) {
                    this.customer = customer;
            }

            public String getDeliveryAddress() {
                    return deliveryAddress;
            }

            public void setDeliveryAddress(String deliveryAddress) {
                    this.deliveryAddress = deliveryAddress;
            }

            public List getMenuItems() {
                    return menuItems;
            }

            public void setMenuItems(List menuItems) {
                    this.menuItems = menuItems;
            }

            public Date getOrderDate() {
                    return orderDate;
            }

            public void setOrderDate(Date orderDate) {
                    this.orderDate = orderDate;
            }

            public String getOrderStatus() {
                    return orderStatus;
            }

            public void setOrderStatus(String orderStatus) {
                    this.orderStatus = orderStatus;
            }

            private double totalAmount;
            private Vendor vendor; // Vendor Detail
            private Customer customer; // Customer Detail
            private String deliveryAddress;
            private List menuItems;
            private Date orderDate;
            private String orderStatus;

}
