package com.attractor.school.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

public class OrderDTO {
    private int id;
    private CustomerDTO customer;
    private ProductDTO product;
    private LocalDateTime localDateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public OrderDTO(CustomerDTO customer, ProductDTO product, LocalDateTime localDateTime) {
        this.id = Integer.parseInt(Long.toString(new Date().getTime()).substring(4));
        this.customer = customer;
        this.product = product;
        this.localDateTime = localDateTime;
    }

}