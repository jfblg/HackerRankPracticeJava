import java.util.stream.Stream;

public class StreamsExample13 {
    public static void main(String[] args) {

        // Reduce
        double total = Stream.of(1.5, 3.2, 5.6)
                .reduce(0.0, (Double a, Double b) -> a+b);
        System.out.println("Total: " + total);
    }
}
