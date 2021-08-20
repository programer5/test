package chapter3.ch03;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

    public VIPCustomer() {
        customerGrad = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;
        System.out.println("VIPCustomer() call");
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
