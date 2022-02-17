import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class TestCode {
    public static void main(String[] args) {
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
