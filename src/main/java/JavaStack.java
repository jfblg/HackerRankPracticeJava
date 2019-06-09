import java.util.Scanner;

public class JavaStack {

    static void isBalanced(String input) {
        System.out.println("true");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String input = sc.next();
            isBalanced(input);
        }
    }
}
