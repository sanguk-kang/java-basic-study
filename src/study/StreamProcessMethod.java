package study;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
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

        // Stream<T> sorted
        System.out.println("test6");
        String[] array = { "carrot", "apple", "banana", "egg", "meat", "apple" };
        List<String> sortTest = Arrays.asList(array);
        // 오름차순
        sortTest.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("test6-0");
        // Stream<T> sorted Comparator
        sortTest.stream()
                        .sorted(new Comparator<String>() {
                            @Override
                            public int compare(String o1, String o2) {
                                return (o2+o1).compareTo(o1+o2);
                            }
                        })
                        .forEach(System.out::println);
        System.out.println("test6-1");
        // 내림차순
        sortTest.stream()
                .sorted(Collections.reverseOrder())
                .distinct()
                .forEach(System.out::println);

        // forEach & peek Test
        System.out.println(">>>>> forEach & peek Test");
        int[] intArr = {1, 2, 3, 4, 5};
        // forEach
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(System.out::println);
        // peek - 동작하지 않음 최종 처리 메소드가 없어서
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(System.out::println);
        // 최종 처리 추가
        int intSum = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(System.out::println)
                .sum();
        System.out.println("result sum: " + intSum);


        //match test
        int[] matchIntArr = {2, 4, 6};
        boolean matchResult = Arrays.stream(matchIntArr)
                .allMatch(a -> a % 2 == 0);
        System.out.println("전체 2배수? -> " + matchResult);

        matchResult = Arrays.stream(matchIntArr)
                .anyMatch(a -> a % 3 == 0);
        System.out.println("한개라도 3배수? -> " + matchResult);

        matchResult = Arrays.stream(matchIntArr)
                .noneMatch(a -> a % 3 == 0);
        System.out.println("3배수 없나? -> " + matchResult);

        // 기본 집계
        long count = Arrays.stream(new int[]{1,2,3,4})
                .filter(n -> n %2 == 0)
                .count();
        System.out.println("2의 배수 갯수 : " + count);

        long sum = Arrays.stream(new int[]{1,2,3,4})
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("2의 배수 합 : " + sum);

        double avg = Arrays.stream(new int[]{1,2,3,4})
                .filter(n -> n % 2 == 0)
                .average()
                .getAsDouble();
        System.out.println("2의 배수 평균 : " + avg);

        int max = Arrays.stream(new int[]{1,2,3,4})
                .max()
                .getAsInt();
        System.out.println("최댓값 : " + max);

        int min = Arrays.stream(new int[]{1,2,3,4})
                .min()
                .getAsInt();
        System.out.println("최솟값 : " + min);

        int first = Arrays.stream(new int[]{1,2,3,4})
                .filter(n -> n % 3 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("첫번째 3의 배수 : " + first);

        // optional
        List<Integer> list = new ArrayList<>();
        // list에 요소가 없을 경우 NoSuchElementException 발생!
        OptionalDouble optionDb = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        if (optionDb.isPresent()) {
            System.out.println("평균 : " + optionDb.getAsDouble());
        } else {
            System.out.println("평균 : 0.0");
        }

        // orElse
        List<Integer> listInt = new ArrayList<>();
        double listAvg = listInt.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("평균 : " + listAvg);

        // ifpresent()
        List<Integer> ipList = new ArrayList<>();
        ipList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(s -> System.out.println("데이터 존재:" + s));
        // ifPresentOrElse
        List<Integer> ipElseList = new ArrayList<>();
        ipElseList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresentOrElse(
                        a -> System.out.println("데이터 존재 : " + a),
                        () -> System.out.println("데이터 미존재")
                );

        // reduce
        List<Integer> reArray = new ArrayList<>();
        reArray.add(1);
        reArray.add(2);
        reArray.add(3);
        int reduceInt = reArray.stream()
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println("reduce 적용1 : " + reduceInt);

        int initInt = reArray.stream()
                .reduce(0, Integer::sum);
        System.out.println("reduce 적용2 : " + initInt);

    }
}
