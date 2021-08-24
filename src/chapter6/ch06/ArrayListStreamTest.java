package chapter6.ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("토마스");
        sList.add("에드워드");
        sList.add("젝키찬");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println("s = " + s));

        sList.stream().sorted().forEach(s -> System.out.println("s = " + s));
        System.out.println();
        sList.stream().map(s -> s.length()).forEach(n -> System.out.println("n = " + n));
        sList.stream().filter(s -> s.length() >= 4).forEach(s -> System.out.println("s = " + s));
    }
}
