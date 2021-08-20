package chapter4.ch03;

public class StringBuilderTest {

    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        StringBuilder sb = new StringBuilder(java);
        System.out.println(System.identityHashCode(sb));
        sb.append(android);
        System.out.println(System.identityHashCode(sb));
        String test = sb.toString();
        System.out.println(System.identityHashCode(test));
        System.out.println("test = " + test);

    }

}
