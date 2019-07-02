import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample12 {
    public static void main(String[] args) throws IOException {

        // Stream rows from a CSV file, store fields in a HashMap

        Stream<String> rows3 = Files.lines(Paths.get("StreamsCantons.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3.map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 10)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])
                ));
        rows3.close();

        for(String key: map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }
}
