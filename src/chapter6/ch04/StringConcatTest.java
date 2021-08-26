package chapter6.ch04;

public class StringConcatTest {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        StringConcatImpl stringImpl = new StringConcatImpl();
        stringImpl.makeString(s1, s2);

        StringConcat stringConcat = (s, v) ->
            System.out.println(s1 + "," + s2);
            stringConcat.makeString(s1, s2);

            StringConcat concat = new StringConcat() {
                @Override
                public void makeString(String s1, String s2) {
                    System.out.println(s1 + "...." + s2);
                }
            };

            concat.makeString(s1, s2);
    }

}
