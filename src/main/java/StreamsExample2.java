import java.util.stream.IntStream;

public class StreamsExample2 {
    public static void main(String[] args) {
        IntStream
                .range(1, 10)
                .skip(5) // skip first 5 elements
                .forEach(x -> System.out.println(x));
        System.out.println();
    }
}
