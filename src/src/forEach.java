import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        // basic
        for (int i=0; i<=10; i++) {
            System.out.println("숫자 증가 : " + i);
        }

        // array
        String[] array = {"a","b","c","d","e"};
        for (String obj : array) {
            System.out.println("문자 연속:" + obj);
        }

        // List
        List<String> items = new ArrayList<>();
        items.add("Paris");
        items.add("Seoul");
        items.add("Tokyo");
        items.add("Washington");
        // array
        for (String s : items) {
            System.out.println("array:" + s);
        }
        // consumer
        items.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("foreach:" + s);
            }
        });
        // lambda
        items.forEach(name -> System.out.println("lambda:" + name));
        items.forEach(System.out::println);

        // Set
        Set<String> set = new HashSet<>();
        set.add("Paris");
        set.add("Seoul");
        set.add("Tokyo");
        set.add("Washington");

        set.forEach(item -> System.out.println(item));
        set.forEach(System.out::println);
        System.out.println("------------------------------------");
        // map
        Map<String, String> map = new HashMap<>();
        map.put("Paris", "France");
        map.put("Seoul", "Korea");
        map.put("Tokyo", "Japan");
        map.put("Washington", "USA");
        // BiConsumer
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String k, String v) {
                System.out.println("BiConsumer key:" + k + ", value: " + v);
            }
        });
        // Lambda
        map.forEach((k,v) -> {
            System.out.println("Lambda key:" + k + ", value:" + v);
        });

    }
}
