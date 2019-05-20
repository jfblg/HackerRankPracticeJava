import java.util.Scanner;

/**
 * Input: String matching regex: [A-Za-z !,?._'@]+
 * Input example: He is a very very good boy, isn't he?
 * Token - 1+ consequtive alphabetic letters
 */

public class JavaStringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] tokens = s.split("[ !,?._'@]+");

        System.out.println(tokens.length);
        for(String t: tokens) {
            System.out.println(t);
        }
        sc.close();
    }
}
