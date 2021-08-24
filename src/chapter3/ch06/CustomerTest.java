package chapter3.ch06;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer(10010, "Tomas");
        Customer customer2 = new Customer(10020, "Tom");
        Customer customer3 = new GoldCustomer(10030, "Tim");
        Customer customer4 = new GoldCustomer(10040, "Tong");
        Customer customer5 = new VIPCustomer(10050, "Tall");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        customers.forEach(customer -> {
            System.out.println(customer.showCustomerInfo());
            int price = customer.calcPrice(10000);
            System.out.println(customer.customerName + "님이 " + price + "원 지불 하셨습니다.");
            System.out.println(customer.customerName + "님의 현재 보너스 포인트는 " + customer.bonusPoint + " 입니다.");

        });

    }
}
