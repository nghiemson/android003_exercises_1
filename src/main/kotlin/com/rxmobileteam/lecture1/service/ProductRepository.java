package com.rxmobileteam.lecture1.service;

import java.util.Collection;
import java.util.List;

public interface ProductRepository {
    boolean add(Product product);

    Collection<Product> findAll();
}
