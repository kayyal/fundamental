package oop.market;

import oop.market.delivery.DeliveryStrategy;

public class Product {
    private String name;
    private double price;
    private double weight;
    private boolean isShippable;
    private DeliveryStrategy deliveryStrategy;

    public Product(String name, double price, double weight, boolean isShippable, DeliveryStrategy deliveryStrategy) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.isShippable = isShippable;
        this.deliveryStrategy = deliveryStrategy;

    }

    public double calculateShippingCost() {
        if (isShippable) {
            return deliveryStrategy.calculateShippingCost(weight);
        }
        {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isShippable() {
        return isShippable;
    }
}
