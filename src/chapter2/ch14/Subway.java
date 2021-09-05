package chapter2.ch14;

public class Subway {

    private int subwayNumber;
    private int passengerCount;
    private int money;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(subwayNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
