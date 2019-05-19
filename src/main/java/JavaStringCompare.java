import java.util.ArrayList;
import java.util.Scanner;

public class JavaStringCompare {

    public static String getSmallestAndLargerst(String s, int k) {
        int arrayLength = s.length() - k + 1;
        String[] stringArray = new String[arrayLength];
        int stepD = 0;
        int stepU = k;
        while(stepU <= s.length()) {
            stringArray[stepD] = s.substring(stepD, stepU);
            stepD++;
            stepU++;
        }

        String smallest = stringArray[0];
        String largest = stringArray[0];


        for(String e : stringArray) {
            int rL = e.compareTo(smallest);
            int rH = e.compareTo(largest);

            if(rL < 0)
                smallest = e;
            if(rH > 0)
                largest = e;
        }

        return String.format("%s\n%s\n", smallest, largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargerst(s, k));
    }
}
