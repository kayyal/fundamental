package oop.market;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }
    public void removeItem (Product product) {
        items.remove(product);
    }

    public double totalPrice() {
        double sum = 0 ;
        for (Product item : items) {
            sum += item.getPrice();
        }
        return sum;
    }


}
