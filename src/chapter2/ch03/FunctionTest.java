package chapter2.ch03;

public class FunctionTest {

    public static int addNum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void sayHello(String greeting) {
        System.out.println("greeting = " + greeting);
    }

    public static int calcSum() {
        int sum = 0;
        int i;

        for (i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);
        System.out.println("total = " + total);

        sayHello("안녕하세요.");

        int calcSum = calcSum();
        System.out.println("calcSum = " + calcSum);
    }
}
