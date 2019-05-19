import java.util.ArrayList;
import java.util.Scanner;

public class JavaStringCompareWithArrayList {

    public static String getSmallestAndLargerst(String s, int k) {
        ArrayList<String> subStrings = new ArrayList<String>();
        int stepD = 0;
        int stepU = k;
        while(stepU <= s.length()) {
            subStrings.add(s.substring(stepD, stepU));
            stepD++;
            stepU++;
        }

        String smallest = subStrings.get(0);
        String largest = subStrings.get(0);

        for(String e : subStrings) {
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
