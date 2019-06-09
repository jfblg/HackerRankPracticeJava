import java.util.stream.Stream;

public class StreamsExample4 {
    public static void main(String[] args) {
        Stream.of("Rob", "Mike", "John")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
