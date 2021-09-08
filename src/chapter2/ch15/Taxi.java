package chapter2.ch15;

public class Taxi {
    private String name;
    private int money;

    public void changeName(String name) {
        this.name = name;
    }

    public int moneyEarn(Person person) {
        System.out.println(person.fare(money));
        return this.money += person.fare(money);
    }

    public void showInfo() {
        System.out.println(name + " 수입은 " + money + "원 입니다.");
    }
}
