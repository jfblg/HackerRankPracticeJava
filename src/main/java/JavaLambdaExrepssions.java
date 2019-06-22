import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * Sample input:
 * 5
 * 1 4
 * 2 5
 * 3 898
 * 1 3
 * 2 12
 *
 *
 * Expected ouput:
 * EVEN
 * PRIME
 * PALINDROME
 * ODD
 * COMPOSITE
 */


interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num){
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return n -> (n & 1) == 1 ? true : false;
    }

    public PerformOperation isPrime() {
        return n -> {
            for(int i = n-1; i > 1; i--) {
                if(n % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return n -> {
            String nAsString = String.valueOf(n);
            String reverse = "";
            boolean result = false;
            for(int i = nAsString.length()-1; i >= 0; i--) {
                reverse = reverse + nAsString.charAt(i);
            }
            if(nAsString.equals(reverse)) {
                result = true;
            }
            return result;
        };
    }
}

public class JavaLambdaExrepssions {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while(T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if(ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }
}
