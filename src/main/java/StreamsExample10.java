import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamsExample10 {
    public static void main(String[] args) throws IOException {
        // Stream rows from a CSV file and count
        Stream<String> rows = Files.lines(Paths.get("/Users/ferojanus/repos/HackerRankPracticeJava/src/main/java/StreamsCantons.txt"));
        int rowCount = (int)rows
                .map(x -> x.split(" "))
                .filter(x -> x.length > 10)
                .count();
        System.out.println("Rows: " + rowCount);
        rows.close();
    }
}
