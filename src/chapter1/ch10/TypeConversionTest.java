package chapter1.ch10;

public class TypeConversionTest {

    public static void main(String[] args) {

//        byte bNum = 125;
        int iNum = 255;
        byte bNum = (byte) iNum;

        System.out.println(bNum);
        System.out.println("iNum = " + iNum);

        double dNum = 3.14;
        int iNum2 = (int) dNum;

        System.out.println(dNum);
        System.out.println("iNum2 = " + iNum2);

        double dnum2 = 1.2;
        float fnum = 0.9f;

        int iNum3 = (int) dnum2 + (int) fnum;
        int iNum4 = (int) (dnum2 + fnum);

        System.out.println(iNum3);
        System.out.println("iNum4 = " + iNum4);

        int myNum = 10;
        int yourNum = 20;

        myNum += yourNum;
        System.out.println("myNum = " + myNum);
    }
}
