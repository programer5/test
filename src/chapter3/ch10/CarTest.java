package chapter3.ch10;

public class CarTest {

    public static void main(String[] args) {
        Car aiCar = new AiCar();
        aiCar.run();
        System.out.println();
        Car mCar = new ManualCar();
        mCar.run();
    }
}
