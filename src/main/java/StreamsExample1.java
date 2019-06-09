import java.util.stream.IntStream;

public class StreamsExample1 {
    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(System.out::println);
        System.out.println();
    }
}
