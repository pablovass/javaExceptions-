package com.pablovass.asingdemo.service;

import com.pablovass.asingdemo.model.Product;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class ProductAsyncService {
    @Async("asyncExecutor")
    public CompletableFuture<List<Product>> getProduct() throws Exception {
       // Thread.sleep(1000);
        List<Product> list = Arrays.asList(new Product(1, "Product 1"), new Product(2, "Product 2"), new Product(3, "Product 3"));
        return CompletableFuture.completedFuture(list);
    }
    @Async("asyncExecutor")
    public CompletableFuture<List<Product>> getProduct2() throws Exception {
        //Thread.sleep(2000);
        List<Product> list = Arrays.asList(new Product(4, "Product 4"), new Product(5, "Product 5"), new Product(6, "Product 6"));
        return CompletableFuture.completedFuture(list);
    }
    @Async("asyncExecutor")
    public CompletableFuture<List<Product>> getProduct3() throws Exception {
        //Thread.sleep(3000);
        List<Product> list = Arrays.asList(new Product(7, "Product 7"), new Product(8, "Product 8"), new Product(9, "Product 9"));
        return CompletableFuture.completedFuture(list);
    }


}
