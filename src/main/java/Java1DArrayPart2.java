import java.util.Scanner;

/**
 * 4
 * 5 3
 * 0 0 0 0 0
 * 6 5
 * 0 0 0 1 1 1
 * 6 3
 * 0 0 1 1 1 0
 * 3 1
 * 0 1 0
 *
 * YES
 * YES
 * NO
 * NO
 */

public class Java1DArrayPart2 {

    public static boolean canMoveForward(int[] arr, int index, int step) {
        if(index + step > arr.length -1)
            return true;
        else if(arr[index + step] == 0)
            return true;
        else if(step > arr.length - index)
            return true;
        else
            return false;
    }

    public static boolean canWin(int leap, int[] game) {
        int index = 0;

        while(index <= game.length) {
            if(canMoveForward(game, index, leap))
                index += leap;
            else if (canMoveForward(game, index, 1))
                index++;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        while(q-- > 0) {
            int n = in.nextInt();
            int leap = in.nextInt();

            int[] game = new int[n];
            for(int i=0; i<n; i++) {
                game[i] = in.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO");
        }

        in.close();
    }
}
