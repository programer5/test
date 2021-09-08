package chapter2.ch15;

public class Person {

    private String name;
    private int money;

    public void setMoney(int money) {
        this.money = money;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public int fare(int money) {
        return this.money -= money;
    }

    public void showInfo() {
        System.out.println(this.name + "님의 남은 돈은 " + this.money + "원 입니다.");
    }
}
