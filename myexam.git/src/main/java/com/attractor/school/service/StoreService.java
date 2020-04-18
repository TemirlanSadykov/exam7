package com.attractor.school.service;

import com.attractor.school.model.Stock;
import com.attractor.school.model.Store;
import com.attractor.school.repository.StockRepository;
import com.attractor.school.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {


    @Autowired
    private StoreRepository storeRepo;

    @Autowired
    private StockRepository stockRepo;

    public List<Store> getStoreList() {
        List<Store> result = new ArrayList<>();
        storeRepo.findAll().forEach(result::add);
        return result;
    }

    public List<Stock> getStockList() {
        List<Stock> result = new ArrayList<>();
        stockRepo.findAll().forEach(result::add);
        return result;
    }

}
