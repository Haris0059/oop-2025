package com.haris.week15.examPrep2.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Inventory <T extends  Product> {
    private List<T> products;

    public Inventory(List<T> products) {
        this.products = products;
    }

    public List<T> filterByName(String name) {
        List<T> result = new ArrayList<>();

        for (T product : products) {
            if (product.getName().equals(name)) {
                result.add(product);
            }
        }

        return result;
    }

    public T getByProductId(int id) {
        for (T product : products) {
            if (product.getProductId() == id) {
                return product;
            }
        }

        throw new NoSuchElementException("Product with ID " + id + " doesn't exist!");
    }

    public List<T> getProducts() {
        return products;
    }
    public void setProducts(List<T> products) {
        this.products = products;
    }
}
