package com.attractor.school.controller;

import com.attractor.school.model.Order;
import com.attractor.school.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@Controller
public class OrderController {

    @Autowired
    private OrderService result;

    @PostMapping("/makeOrder")
    public Order makeOrder(@RequestParam("customerId") int customerId, @RequestParam("productId") int productId, LocalDateTime localDateTime){
        return result.makeOrder(customerId, productId, localDateTime.now());
    }

    @PostMapping("/makeOrderForStore")
    public Order makeOrderForStore(@RequestParam("storeId") int storeId, @RequestParam("productId") int productId, LocalDateTime localDateTime){
        return result.makeOrder(storeId, productId, localDateTime.now());
    }



}
