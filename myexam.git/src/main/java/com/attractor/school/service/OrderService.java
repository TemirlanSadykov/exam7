package com.attractor.school.service;

import com.attractor.school.dto.Answer;
import com.attractor.school.model.Customer;
import com.attractor.school.model.Order;
import com.attractor.school.model.Product;
import com.attractor.school.model.Store;
import com.attractor.school.repository.CustomerRepository;
import com.attractor.school.repository.OrderRepository;
import com.attractor.school.repository.ProductRepository;
import com.attractor.school.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private ProductRepository prodRepo;

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private StoreRepository storeRepo;

    public Product p;

    public Order makeOrder(int customerId, int productId, LocalDateTime localDateTime){
        LocalDateTime now = localDateTime.now();
        Optional<String> product = prodRepo.findById(productId);
        if(product.isEmpty()){
            return new Order("This product is not exist");
        }
        else if(!orderRepo.findByCustomerAndProduct(customerId, productId).isEmpty()){
            return new Order("The product is already exist");
        }
        else {
            Order order = orderRepo.save(new Order(productId, customerId, now));
            return new Order("Purchase completed successfully");
        }
    }

    public Order makeOrderForStore(int storeId, int productId, LocalDateTime localDateTime){
        LocalDateTime now = localDateTime.now();
        Optional<String> product = prodRepo.findById(productId);
        if(product.isEmpty()){
            return new Order("This product is not exist");
        }
        else if(!storeRepo.findByStoreAndProduct(storeId, productId).isEmpty()){
            return new Order("The product is already exist");
        }
        else {
            Order order = orderRepo.save(new Order(productId, storeId, now));
            return new Order("Purchase completed successfully");
        }
    }

}
