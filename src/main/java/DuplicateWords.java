import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    public static void main(String[] args) {
        String regex = "\\b(\\w+)\\s+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); //insert the pattern flag here

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while(numSentences-- >0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            System.out.println(m.groupCount());

            while(m.find()) {
//                input = input.replaceAll("(\\b\\w+\\b)\\W+\\1", "");
                input = input.replaceAll("\\s+\\b(\\w+)\\s+\\1\\b", "");
            }
            System.out.println(input);
        }
        in.close();
    }
}
