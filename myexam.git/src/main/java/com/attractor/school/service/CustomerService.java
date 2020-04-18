package com.attractor.school.service;

import com.attractor.school.model.Customer;
import com.attractor.school.model.Order;
import com.attractor.school.repository.CustomerRepository;
import com.attractor.school.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private OrderRepository orRepo;

    @Autowired
    private CustomerRepository cusRepo;

    public Optional<Order> myOrders(int customerId){
        return orRepo.findById(customerId);
    }

    public Customer newRegistration(String name, String email){
        return cusRepo.save(new Customer(name, email));
    }

}
