import java.util.Scanner;

class MyCalculator2 {
    long power(int n, int p) throws Exception {

        if (n == 0 && p ==0) {
            throw new Exception("n and p should not be zero.");
        } else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        long result = 1;

        for(int i=0; i<p; i++) {
            result = result * n;
        }
        return result;
    }

}

public class JavaExceptionHandling {
    public static final MyCalculator2 myCalculator2 = new MyCalculator2();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while(in.hasNext()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.print(myCalculator2.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
