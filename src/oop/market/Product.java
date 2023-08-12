package oop.market;

public class Product {
    private String name;
    private double price;
    private double weight;
    private boolean isShippable;

    public Product(String name, double price, double weight, boolean isShippable) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.isShippable = isShippable;
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
