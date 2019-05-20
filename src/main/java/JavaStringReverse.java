import java.util.Scanner;

public class JavaStringReverse {

    public static String isPolyrome(String A) {
        int stepCount;
        boolean result = true;

        if(A.length() % 2 == 1) {
            stepCount = (A.length() - 1) / 2;
        } else {
            stepCount = A.length() / 2;
        }

        for(int i=0; i < stepCount; i++) {
            if(A.charAt(i) != A.charAt(A.length()-1-i)) {
                result = false;
            }
        }

        if(result)
                return "Yes";
        else
            return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        // print Yes if it is a polydrome
        System.out.printf(isPolyrome(A));

    }
}
