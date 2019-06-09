import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamsExample8 {
    public static void main(String[] args) throws IOException {
        //Stream rows from a text file, map, sort and print
        Stream<String> lines = Files.lines(Paths.get("StreamsCantons.txt"));
        lines.sorted().filter(x -> x.length() > 100).forEach(System.out::println);
        lines.close();
    }
}
