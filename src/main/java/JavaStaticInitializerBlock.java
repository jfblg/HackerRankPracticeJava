import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * If both values are greater than zero, then the main method must output the area of the parallelogram.
 * Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
 */

public class JavaStaticInitializerBlock {
    private static int B;
    private static int H;
    private static boolean flag;
    static {
        try {
            flag = initializeVariables();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static boolean initializeVariables() throws Exception {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        if  ((B <= 0) || (H <= 0)) {
            throw new Exception("Breadth and height must be positive");
        }
        return true;
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
