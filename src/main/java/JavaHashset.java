import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for(int i=0; i<t ;i ++) {
            pair_left[i] = sc.next();
            pair_right[i] = sc.next();
        }
        // my code
        Set<String> wordsLeft = new HashSet<>();
        Set<String> wordsRight = new HashSet<>();
        Set<String> pairs = new HashSet<>();
        for(int i=0; i<t ;i ++) {
            String pair = pair_left[i] + " " + pair_right[i];
            pairs.add(pair);
            System.out.println(pairs.size());
        }

//        Iterator it = words.iterator();
//        while(it.hasNext()) {
//            Object object = it.next();
//            System.out.println(object);
//        }

        sc.close();
    }

}
