package com.deku.simpleWebapp.service;

import com.deku.simpleWebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Iphone",50000),new Product(102,"Cannon",70000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductsById(int prodId) {
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().orElse(new Product(100,"No item",0));
    }

    public void addProduct(Product product){
        System.out.println("here is the product " + product);
        products.add(product);
    }
}
