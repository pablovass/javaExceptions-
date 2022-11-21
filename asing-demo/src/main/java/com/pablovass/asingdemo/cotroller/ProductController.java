package com.pablovass.asingdemo.cotroller;

import com.pablovass.asingdemo.model.Product;
import com.pablovass.asingdemo.service.ProductAsyncService;
import com.pablovass.asingdemo.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;
    private final ProductAsyncService productAsyncService;

    public ProductController(ProductService productService, ProductAsyncService productAsyncService) {
        this.productService = productService;
        this.productAsyncService = productAsyncService;
    }

    @GetMapping
    public List<Product> getAllProducts() throws Exception {
        List<Product> list1 = productService.getProduct();
        List<Product> list2 = productService.getProduct2();
        List<Product> list3 = productService.getProduct3();

        List<Product> list4 = Stream.of(list1, list2, list3)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        return list4;
    }

    @GetMapping("/async")
    public List<Product> getAllProductsAsync() throws Exception {
       CompletableFuture<List<Product>> c1=productAsyncService.getProduct();
        CompletableFuture<List<Product>> c2=productAsyncService.getProduct2();
        CompletableFuture<List<Product>> c3=productAsyncService.getProduct3();
         CompletableFuture.allOf(c1,c2,c3).join();

        List<Product> list4 = Stream.of(c1.get(),c2.get(),c3.get())
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        return list4;
    }
}
