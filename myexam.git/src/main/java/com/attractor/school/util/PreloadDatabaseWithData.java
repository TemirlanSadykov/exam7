package com.attractor.school.util;

import com.attractor.school.model.Customer;
import com.attractor.school.model.Product;
import com.attractor.school.model.Stock;
import com.attractor.school.model.Store;
import com.attractor.school.repository.CustomerRepository;
import com.attractor.school.repository.ProductRepository;
import com.attractor.school.repository.StockRepository;
import com.attractor.school.repository.StoreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
public class PreloadDatabaseWithData {

    @Bean
    CommandLineRunner initDatabase(CustomerRepository repository){

        repository.deleteAll();

        return (args) -> Stream.of(customers())
                .peek(System.out::println)
                .forEach(repository::save);
    }

    private Customer[] customers(){

        return new Customer[]{
                new Customer("admin1", "admin1@gmai.com"),
                new Customer("admin2", "admin2@gmai.com"),
                new Customer("admin3", "admin3@gmai.com"),
                new Customer("admin4", "admin4@gmai.com"),
        };
    }

    @Bean
    CommandLineRunner initDatabase(StoreRepository repository){

        repository.deleteAll();

        return (args) -> Stream.of(stores())
                .peek(System.out::println)
                .forEach(repository::save);
    }

    private Store[] stores(){

        return new Store[]{
                new Store(1, "store1", "desc"),
                new Store(2, "store2", "desc"),
                new Store(3, "store3", "desc"),
                new Store(4, "store4", "desc"),
                new Store(5, "store5", "desc"),
        };
    }

    @Bean
    CommandLineRunner initDatabase(StockRepository repository){

        repository.deleteAll();

        return (args) -> Stream.of(stocks())
                .peek(System.out::println)
                .forEach(repository::save);
    }

    private Stock[] stocks(){

        return new Stock[]{
                new Stock(1, "stock1", "desc"),
                new Stock(2, "stock2", "desc"),
                new Stock(3, "stock3", "desc"),
                new Stock(4, "stock4", "desc"),
                new Stock(5, "stock5", "desc"),
        };
    }
}