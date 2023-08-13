package oop.market;

import oop.market.delivery.DeliveryStrategy;
import oop.market.delivery.StandardDelivery;

import java.util.List;

public class MarketSimulation {
    public static void main(String[] args) {
        DeliveryStrategy standardDelivery = new StandardDelivery();

        Repository repository = new Repository();
        repository.addProduct(new Product("Laptop", 1000, 2.5, true, standardDelivery));
        repository.addProduct(new Product("Smartphone", 800, 0.5, true, standardDelivery));
        repository.addProduct(new Product("Shirt", 25, 0.3, false, null)); // Non-shippable

        // Simulate browsing products and calculating shipping costs
        List<Product> products = repository.getProducts();
        for (Product product : products) {
            System.out.println("Product: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
            if (product.isShippable()) {
                System.out.println("Shipping cost: $" + product.calculateShippingCost());
            } else {
                System.out.println("Non-shippable product");
            }
            System.out.println();
        }
    }
}
