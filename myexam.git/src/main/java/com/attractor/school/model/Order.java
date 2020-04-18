package com.attractor.school.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document
@Data
public class Order {
    @Id
    private int id;
    private int customerId;
    private int productId;
    private LocalDateTime localDateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Order(int customerId, int productId, LocalDateTime localDateTime) {
        this.id = Integer.parseInt(Long.toString(new Date().getTime()).substring(4));
        this.customerId = customerId;
        this.productId = productId;
        this.localDateTime = localDateTime;
    }
    private String result;
    public Order(String result){
        this.result = result;
    }

}