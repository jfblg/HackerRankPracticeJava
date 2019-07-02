import java.util.Arrays;

public class StreamsExample6 {
    public static void main(String[] args) {
        // return an average of squares of an int[]

        Arrays.stream(new int[] {1,2,3,4,5,6,7})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);
    }
}
