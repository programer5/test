package chapter2.ch14;

public class TakeTransTest {

    public static void main(String[] args) {

        Student student1 = new Student("james", 5000);
        Student student2 = new Student("tomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        student1.takeBus(bus100);

        Subway greenSubway = new Subway(2);
        student2.takeSubway(greenSubway);

        student1.showInfo();
        student2.showInfo();

        bus100.showBusInfo();
        greenSubway.showSubwayInfo();

        bus500.showBusInfo();
    }
}
