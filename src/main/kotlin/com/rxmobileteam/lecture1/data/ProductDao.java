package com.rxmobileteam.lecture1.data;

import com.rxmobileteam.lecture1.service.Product;
import com.rxmobileteam.lecture1.service.ProductRepository;
import com.rxmobileteam.utils.ExerciseNotCompletedException;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * {@link ProductDao} represents a Data Access Object (DAO) for products.
 * <p>
 * todo: 1. Implement a method {@link ProductDao#add(Product)} that store new product into the set
 * todo: 2. Implement a method {@link ProductDao#findAll()} that returns a set of all products
 */
public class ProductDao implements ProductRepository {
    private final Map<String, Product> products = new HashMap<>();

    /**
     * Stores a new product
     * @param product a product to store
     * @return {@code true} if a product was stored, {@code false} otherwise
     */
    public boolean add(@NotNull Product product) {
        if (products.containsKey(product.getId())) {
            return false;
        }
        products.put(product.getId(), product);
        return true;
    }

    /**
     * Returns all stored products
     *
     * @return a set of all stored products
     */
    public Collection<Product> findAll() {
        return products.values();
    }

}