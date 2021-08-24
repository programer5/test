package chapter3.ch06;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

//    public VIPCustomer() {
//        customerGrad = "VIP";
//        salesRatio = 0.1;
//        bonusRatio = 0.05;
//    }

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        customerGrad = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int) (price * salesRatio);
        return price;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
