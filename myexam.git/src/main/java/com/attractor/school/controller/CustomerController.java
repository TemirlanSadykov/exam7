package com.attractor.school.controller;

import com.attractor.school.model.Customer;
import com.attractor.school.model.Order;
import com.attractor.school.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Controller
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/")
    public Optional<Order> myOrders(@RequestParam("customerId") int customerId){
        return service.myOrders(customerId);
    }

    @PostMapping("/")
    public Customer newRegistration(@RequestParam("name") String name, @RequestParam("email") String email){
        return service.newRegistration(name, email);
    }

}
