package oop.market;

public class MarketSimulation {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1000, 2.5, true);
        Product shirt = new Product("Shirt", 25, 0.3, false);
        Product shampoo = new Product("Shampoo", 8, 0.5, true);
        Repository electronicsRepository = new Repository();
        electronicsRepository.addProduct(laptop);

        Repository clothingRepository = new Repository();
        clothingRepository.addProduct(shirt);

        Repository hygieneRepository = new Repository();
        hygieneRepository.addProduct(shampoo);

        Market market = new Market("Koorosh");
        market.addRepository(electronicsRepository);
        market.addRepository(clothingRepository);
        market.addRepository(hygieneRepository);


        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItem(laptop);
        cart1.addItem(shirt);

        double totalPrice = cart1.totalPrice();
        System.out.println("totalPrice = " + totalPrice);

    }
}
