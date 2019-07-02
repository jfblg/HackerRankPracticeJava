import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamsExample14 {
    public static void main(String[] args) {
        // Integer Summary statistics
        // Note: works only for integers

        IntSummaryStatistics summary = IntStream.of(1,2,3,4,5,5,6,7,8,8)
                .summaryStatistics();
        System.out.println(summary);
    }
}
