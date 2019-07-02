import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamsExample11{
    public static void main(String[] args) throws IOException {
        //Stream rows from CSV file, parse data from rows
        Stream<String> rows2 = Files.lines(Paths.get("/Users/ferojanus/repos/HackerRankPracticeJava/src/main/java/StreamsCantons.txt"));
        rows2.map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 10)
                .forEach(System.out::println);
        rows2.close();
    }
}
