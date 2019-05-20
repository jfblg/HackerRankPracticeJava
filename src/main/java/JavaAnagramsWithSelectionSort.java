import java.util.Scanner;

public class JavaAnagramsWithSelectionSort {
    public static String sortCharArray(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            char smallerChar = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerChar;
        }
        return String.valueOf(arr);
    }

    public static boolean isAnagram(String a, String b) {
        String A = sortCharArray(a.toLowerCase().toCharArray());
        String B = sortCharArray(b.toLowerCase().toCharArray());
        return A.equals(B);
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
