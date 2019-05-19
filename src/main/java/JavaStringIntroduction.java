import java.util.Scanner;

public class JavaStringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        // sum lenghth of A and B
        System.out.println(A.length() + B.length());

        // Yes if A is lexigraphically greater than B, else No
        int result = B.compareTo(A);
        String answer = (result >= 0) ? "No" : "Yes";
        System.out.println(answer);

        // capitalize A and B and print them on single line
        String capA = A.substring(0,1).toUpperCase() + A.substring(1);
        String capB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.printf("%s %s\n", capA, capB);
    }
}
