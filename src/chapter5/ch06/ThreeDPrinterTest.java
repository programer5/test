package chapter5.ch06;

public class ThreeDPrinterTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
        ThreeDPrinter2 printer2 = new ThreeDPrinter2();
        printer2.setMaterial(powder);

        Powder p = (Powder) printer2.getMaterial();

    }

}
