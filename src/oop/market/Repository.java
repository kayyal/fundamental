package oop.market;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts(){
        return products;
    }

}
