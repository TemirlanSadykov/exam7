package com.attractor.school.controller;

import com.attractor.school.model.Product;
import com.attractor.school.model.Stock;
import com.attractor.school.model.Store;
import com.attractor.school.service.ProductService;
import com.attractor.school.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
public class StoreController {
    @Autowired
    private StoreService service;

    @Autowired
    private ProductService product;

    @GetMapping("/store")
    public List<Store> getStoreList(){
        return service.getStoreList();
    }

    @GetMapping("/stock")
    public List<Stock> getStockList(){
        return service.getStockList();
    }

    @PostMapping("/products")
    public List<Product> getProductList(@RequestParam("name") String name){
        return product.getProductList(name);
    }
}
