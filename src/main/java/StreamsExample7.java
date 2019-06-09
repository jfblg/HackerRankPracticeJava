import java.util.Arrays;
import java.util.List;

public class StreamsExample7 {
    public static void main(String[] args) {
        // Stream from a List, then filter and print
        List<String> people = Arrays.asList("Bob", "Adam", "Cyril", "Edo", "Emil");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("e"))
                .forEach(System.out::println);
    }
}
