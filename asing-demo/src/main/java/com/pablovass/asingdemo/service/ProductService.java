package com.pablovass.asingdemo.service;

import com.pablovass.asingdemo.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProduct()throws Exception{
    return Arrays.asList(new Product(1,"Product 1"),new Product(2,"Product 2"),new Product(3,"Product 3"));
}
    public List<Product> getProduct2()throws Exception{
        return Arrays.asList(new Product(4,"Product 4"),new Product(5,"Product 5"),new Product(6,"Product 6"));
    }
    public List<Product> getProduct3()throws Exception{
        return Arrays.asList(new Product(7,"Product 7"),new Product(8,"Product 8"),new Product(9,"Product 9"));
    }
}
