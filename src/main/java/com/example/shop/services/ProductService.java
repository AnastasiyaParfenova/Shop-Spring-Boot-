package com.example.shop.services;

import com.example.shop.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;
    {
        products.add(new Product(++ID, "PlayStation 5", "Simple description", 6700, "Ekaterinburg", "Tomas"));
        products.add(new Product(++ID,"iPhone 11", "Simple description", 64700, "Moscow", "Tom"));
    }
    public List<Product> listProducts(){ return products; }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}
