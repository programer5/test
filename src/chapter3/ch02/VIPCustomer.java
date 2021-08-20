package chapter3.ch02;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

    public VIPCustomer() {
        customerGrad = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
