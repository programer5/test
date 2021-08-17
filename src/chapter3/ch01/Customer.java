package chapter3.ch01;

public class Customer {

    protected int customerId;
    protected String customerName;
    protected String customerGrad;
    int bonusPoint;
    double bonusRatio;

    String agentID;
    double saleRatio;

    public Customer() {
        customerGrad = "SILVER";
        bonusRatio = 0.01;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrad() {
        return customerGrad;
    }

    public void setCustomerGrad(String customerGrad) {
        this.customerGrad = customerGrad;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrad + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
