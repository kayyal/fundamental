package oop.market.delivery;

public class StandardDelivery implements DeliveryStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 0.5;
    }
}
