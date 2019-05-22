import java.util.Arrays;
import java.util.Scanner;

public class Java2DArray {

    public static void print2DArray(int[][] arr) {
        int y = arr.length;
        int x = arr[0].length;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static int sumofRow(int[] row) {
        int sumRow = 0;
        for (int i = 0; i < row.length; i++) {
            sumRow += row[i];
        }
        return sumRow;
    }

    public static int getSumtOfHourglass(int[][] arr) {
        int row1 = sumofRow(arr[0]);
        int row2 = arr[1][1];
        int row3 = sumofRow(arr[2]);

        return row1 + row2 + row3;
    }

    public static int[][] getSubArray(int[][] arr, int x, int y) {
        int[][] sub2DArray = new int[3][3];

        for (int i = 0; i < 3; i++) {
            sub2DArray[i]= Arrays.copyOfRange(arr[i + y] ,x, x+3);
        }
        return sub2DArray;
    }

    public static int sumBiggestSumOfHourglass(int[][] arr) {
        int y = arr.length;
        int x = arr[0].length;

        int highestSum = 0;

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                int[][] subArray = getSubArray(arr, j, i);
                int sum = getSumtOfHourglass(subArray);
                if(sum > highestSum)
                    highestSum = sum;
            }
        }

        return highestSum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scan.nextLine().split(" ");
            scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                arr[i][j] = Integer.parseInt(arrRowItems[j]);
            }
        }
        scan.close();

        System.out.println(sumBiggestSumOfHourglass(arr));
    }

}
