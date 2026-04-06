package org.example.SS02.bai3;

import java.util.Date;

public class Order {
    private String id;
    private String productName;
    private double price;
    private Date orderDate;

    public Order(String id, String productName, double price, Date orderDate) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.orderDate = orderDate;
    }

    // Getters
    public String getId() { return id; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public Date getOrderDate() { return orderDate; }
}