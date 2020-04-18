package com.attractor.school.service;

import com.attractor.school.model.Product;
import com.attractor.school.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {

    @Autowired
    private ProductRepository prodRepo;

    public List<Product> getProductList(String name){
        return prodRepo.findAllByName(name);
    }


}
