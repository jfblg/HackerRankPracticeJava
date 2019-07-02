import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingWithTryAndCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        try {
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException | ArithmeticException e) {
            if(e.toString().contains("InputMismatchException")){
                String[] excptName = e.toString().split(":");
                System.out.println(excptName[0]);
            }
            else {
                System.out.println(e);
            }

        } finally {
            sc.close();
        }

    }
}
