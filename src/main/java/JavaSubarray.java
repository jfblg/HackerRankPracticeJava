import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {

    public static void printArray(int[] arr) {
        for(int i=0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("\n");
    }

    public static boolean isSumOfArrNegative(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum < 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = Integer.parseInt(sc.nextLine());

        // read the values and store the in int[]
        int[] arr = new int[arraySize];
        String[] strArr = sc.nextLine().split(" ");
        for(int i =0; i < arraySize; i++) {
           arr[i] = Integer.parseInt(strArr[i]);
        }
        sc.close();

        int countOfNegative = 0;
        for(int stepIncrease = 0; stepIncrease < arr.length+1; stepIncrease++) {
            for(int i=0; i < arr.length - stepIncrease; i++) {
                if(isSumOfArrNegative(Arrays.copyOfRange(arr, i, i + 1 + stepIncrease)))
                    countOfNegative++;
            }
        }

        System.out.println(countOfNegative);
    }
}
