import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample9 {
    public static void main(String[] args) throws IOException {
        // Stream rows from a text file and save to a list
        List<String> cantons = Files.lines(Paths.get("/Users/ferojanus/repos/HackerRankPracticeJava/src/main/java/StreamsCantons.txt"))
                .filter(x -> x.contains("g"))
                .collect(Collectors.toList());
        cantons.forEach(System.out::println);
    }
}
