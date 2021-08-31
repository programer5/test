package chapter5.ch07;

import chapter5.ch06.GenericPrinter;
import chapter5.ch06.Powder;

public class genericPrinterTest {

    public static void main(String[] args) {
        Powder powder = new Powder();
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(powder);

        Powder p = powderGenericPrinter.getMaterial();
        System.out.println(powderGenericPrinter.toString());

    }
}
