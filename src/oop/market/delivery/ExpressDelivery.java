package oop.market.delivery;

public class ExpressDelivery implements DeliveryStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 1.5;
    }
}
