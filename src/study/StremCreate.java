package study;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StremCreate {
    public static void main(String[] args) {


        Stream<String> stream1 = Stream.of("code", "chacha", "blog", "example");
        System.out.println("stream1");
        stream1.forEach(s -> System.out.println(s));

        Stream<String> stream2 = Stream.empty();
        System.out.println("stream2");
        stream2.forEach(s -> System.out.println(s));

        Stream<String> stream3 = Stream.generate(() -> "Echo").limit(5);
        System.out.println("stream3");
        stream3.forEach(System.out::println);

        Stream<Double> stream4 = Stream.generate(Math::random).limit(5);
        System.out.println("stream4");
        stream4.forEach(System.out::println);

        Stream<Integer> stream5 = Stream.iterate(0, n -> n + 2).limit(5);
        System.out.println("stream5");
        stream5.forEach(System.out::println);

        List<String> list =
                Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1");
        Stream<String> stream6 = list.stream();
        System.out.println("stream6");
        stream6.forEach(System.out::println);

        // 숫자
        IntStream intStr = IntStream.of(1, 2, 3);
        System.out.println("test1");
        intStr.forEach(System.out::println);

        // 범위
        IntStream intStr2 = IntStream.range(1, 10);
        System.out.println("test3");
        intStr2.forEach(x -> System.out.println(x));

        IntStream intStr3 = IntStream.rangeClosed(1, 10);
        System.out.println("test4");
        intStr3.forEach(x -> System.out.println(x));

        // lambda - iterate
        Stream<Integer> test1 = Stream.iterate(0, n -> n + 1) // 0, 1, 2, 3, ...
                .limit(5);
        System.out.println("test5");
        test1.forEach(System.out::println);

        Stream<Integer> test2 = Stream.iterate(0, n -> n<5, n-> n+1);
        System.out.println("test6");
        test2.forEach(System.out::println);



    }
}
