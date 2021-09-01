package chapter6.ch08;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerJung = new TravelCustomer("정민서", 13, 50);

        List<TravelCustomer> travelCustomers = new ArrayList<>();
        travelCustomers.add(customerLee);
        travelCustomers.add(customerKim);
        travelCustomers.add(customerJung);

        System.out.println("고객 명단 출력");
        travelCustomers.stream().map(c->c.getName()).forEach(s-> System.out.println("s = " + s));

        System.out.println("여행비용");
        int sum = travelCustomers.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("sum = " + sum);

        System.out.println("20세 이상 고객");
        travelCustomers.stream().filter(c-> c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s -> System.out.println("s = " + s));
    }
}
