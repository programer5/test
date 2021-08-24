package chapter6.ch06;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        for (int num : arr) {
            System.out.println("num = " + num);
        }
        System.out.println("============");
        Arrays.stream(arr).forEach(n -> System.out.println("n = " + n));

    }
}
