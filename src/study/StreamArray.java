package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamArray {
    public static void main(String[] args) {
        // string
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        String[] result = list.stream()
                .map(String::toUpperCase)
                .toArray(String[]::new);
        for (String s: result) {
            System.out.println(s);
        }

        // integer
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        Integer[] result2 = list2.stream()
                .map(x -> x*x)
                .toArray(Integer[]::new);
        for (Integer n : result2) {
            System.out.println(n);
        }


        // Stream -> Integer[]
        int[] num = {1, 2, 3};
        IntStream intStream = Arrays.stream(num);

        Integer[] result3 = intStream
                .map(x -> x*x)
                .boxed()
                .toArray(Integer[]::new);

        for (Integer n : result3) {
            System.out.println(n);
        }

    }
}
