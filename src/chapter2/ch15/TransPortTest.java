package chapter2.ch15;

public class TransPortTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.changeName("정민서");
        person.setMoney(20000);
        person.fare(10000);
        person.showInfo();

        Taxi taxi = new Taxi();
        taxi.changeName("잘 나간다 운수택시");
        taxi.moneyEarn(person);
        taxi.showInfo();
    }
}
