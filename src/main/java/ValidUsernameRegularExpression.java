import java.util.Scanner;

class UsernameValidator {
    // write regex here
    public static final String regularExpression = "^[a-zA-Z]{1}[a-zA-Z0-9_]{7,29}$";
}

public class ValidUsernameRegularExpression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCases = Integer.parseInt(in.nextLine());
        while(numCases-- > 0) {
            String userName = in.nextLine();
            if(userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
