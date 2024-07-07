package com.example.productservice.interfaceservice;

import com.example.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(long id);

    List<Product> getProducts();

    Product updateProduct(long id, Product product);

    Product replaceProduct(long id);
}
