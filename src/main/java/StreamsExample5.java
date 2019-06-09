import java.util.Arrays;

public class StreamsExample5 {
    public static void main(String[] args) {
        String[] names = {"Alex", "Adam", "Stephan", "Stevo", "Peter"};

        Arrays.stream(names)    // same as Stream.of()
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }
}
