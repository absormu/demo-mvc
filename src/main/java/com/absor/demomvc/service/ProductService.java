package com.absor.demomvc.service;

import com.absor.demomvc.entity.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private static List<Product> products = Arrays.asList(
            new Product("001", "T-001", "Test Product 001", 100000.0),
            new Product("002","T-002","Test Product 002",200000.0),
            new Product("003","T-003","Test Product 003",300000.0),
            new Product("004","T-004","Test Product 004",400000.0),
            new Product("005","T-005","Test Product 005",500000.0)
    );

    public List<Product> findAll(){
        return products;
    }
}
