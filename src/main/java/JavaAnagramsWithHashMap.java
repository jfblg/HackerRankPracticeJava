import java.util.HashMap;
import java.util.Scanner;

public class JavaAnagramsWithHashMap {

    public static HashMap<Character, Integer> getHashMap(String str) {

        HashMap<Character,Integer> aStrDict = new HashMap<Character, Integer>();
        for(int i=0; i < str.length(); i++) {
            int currentCount = aStrDict.getOrDefault(str.charAt(i), 0);
            currentCount++;
            aStrDict.put(str.charAt(i), currentCount);
        }
        return  aStrDict;
    }

    public static boolean isAnagram(String a, String b) {

        HashMap<Character,Integer> aStrDict = getHashMap(a);
        HashMap<Character,Integer> bStrDict = getHashMap(b);

        // print the hashMap - for debug purpose
//        for(Map.Entry<Character, Integer> entry : aStrDict.entrySet()) {
//            Character key = entry.getKey();
//            int value = entry.getValue();
//            System.out.printf("%c : %d \n", key, value);
//        }

        return aStrDict.equals(bStrDict);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams");
    }

}
