import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int buffer = a + b;
            if(n == 1) {
                System.out.print(buffer + "\n");
            } else {
                System.out.print(buffer + " ");
            }
            for(int j=1; j<n; j++) {
                buffer = buffer + (int)Math.pow(2, j) * b;
                if(j == n-1) {
                    System.out.print(buffer + "\n");
                } else {
                    System.out.print(buffer + " ");
                }
            }
        }
        in.close();
    }
}

/**
 * 30
 *
 * 0 1 6
 *
 * 4 4 7
 *
 * 4 2 4
 *
 * 4 4 5
 *
 * 2 4 5
 *
 * 2 1 6
 *
 * 2 4 10
 *
 * 2 0 5
 *
 * 4 0 4
 *
 * 1 3 14
 *
 * 0 0 12
 *
 * 0 1 2
 *
 * 3 1 6
 *
 * 1 0 7
 *
 * 3 4 13
 *
 * 4 3 9
 *
 * 4 0 15
 *
 * 3 3 7
 *
 * 4 4 2
 * {-truncated-}
 * ****************************
 * 1 3 7 15 31 63
 *
 * 8 16 32 64 128 256 512
 *
 * 6 10 18 34
 *
 * 8 16 32 64 128
 *
 * 6 14 30 62 126
 *
 * 3 5 9 17 33 65
 *
 * 6 14 30 62 126 254 510 1022 2046 4094
 *
 * 2 2 2 2 2
 *
 * 4 4 4 4
 *
 * 4 10 22 46 94 190 382 766 1534 3070 6142 12286 24574 49150
 *
 * 0 0 0 0 0 0 0 0 0 0 0 0
 *
 * 1 3
 *
 * 4 6 10 18 34 66
 *
 * 1 1 1 1 1 1 1
 *
 * 7 15 31 63 127 255 511 1023 2047 4095 8191 16383 32767
 *
 * 7 13 25 49 97 193 385 769 1537
 *
 * 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4
 *
 * 6 12 24 48 96 192 384
 *
 * 8 16
 *
 * 4 4 4 4 4 4 4 4 4 4
 * {-truncated-}
 */
