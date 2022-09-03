package ru.gb.productservice;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> products() {
        return List.of(new Product[]{
                new Product(1L, "Product1", 10),
                new Product(2L, "Product2", 15),
                new Product(3L, "Product3", 20),
                new Product(4L, "Product4", 25),
                new Product(5L, "Product5", 30)
        });
    }
    public List<Product> findAll() {
        return products();
    }

}
