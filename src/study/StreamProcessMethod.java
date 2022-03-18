package study;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * stream 중간 처리 메소드 연습
 */
public class StreamProcessMethod {
    public static void main(String[] args) {
        // distinct 중복 제거
        System.out.println("test1");
        List<String> names = Arrays.asList("aaa", "bbb", "aaa", "ccc", "aaa");
        names.stream()
                .distinct()
                .forEach(System.out::println);

        // filter
        System.out.println("test2");
        List<String> names2 = Arrays.asList("aaa", "bbb", "aaa", "ccc", "aaa");
        names2.stream()
                .filter(n -> n.equals("aaa"))
                .forEach(System.out::println);

        // flatMapXXX
        System.out.println("test3");
        List<String> flatTest = Arrays.asList("Hello", "world");
        long res = flatTest.stream()
                .flatMap(data -> Arrays.stream(data.split("")))
                .count();
        System.out.println(res);

        // mapXXX()
        System.out.println("test4");
        List<String> inputList = Arrays.asList("Hello", "world");
        long res2 = inputList.stream()
                .flatMap(data -> Arrays.stream(data.split("")))
                .count();
        System.out.println(res2);
        long res3 = inputList.stream()
                .map(data -> Arrays.stream(data.split("")))
                .count();
        System.out.println(res3);

        // asDoubleStream(), asLongStream(), boxed()
        System.out.println("test5");
        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStrTest = Arrays.stream(intArray);
        intStrTest.asDoubleStream()
                .forEach(System.out::println);

        IntStream intStrTest2 = Arrays.stream(intArray);
        intStrTest2.boxed()
                .forEach(System.out::println);



    }
}
