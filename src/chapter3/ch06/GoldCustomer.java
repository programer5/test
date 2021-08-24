package chapter3.ch06;

public class GoldCustomer extends Customer {

    private double salesRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        salesRatio = 0.1;
        bonusRatio = 0.02;
        customerGrad = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * salesRatio);
    }
}
