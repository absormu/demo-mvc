package com.absor.demomvc.service;

import com.absor.demomvc.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private static List<Product> products = new ArrayList<Product>(){
            {
                add(new Product(""+System.currentTimeMillis(), "T-001", "Test Product 001", 100000.0));
                add(new Product(""+System.currentTimeMillis(),"T-002","Test Product 002",200000.0));
                add(new Product(""+System.currentTimeMillis(),"T-003","Test Product 003",300000.0));
                add(new Product(""+System.currentTimeMillis(),"T-004","Test Product 004",400000.0));
                add(new Product(""+System.currentTimeMillis(),"T-005","Test Product 005",500000.0));
            }
    };



    public List<Product> findAll(){
        return products;
    }

    public void addProduct(Product product){
        product.setId(""+System.currentTimeMillis());
        products.add(product);
    }
}
