import java.util.Scanner;

/**
 * byte < short < int < long
 * 8b < 16b < 32b < 64b
 */

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        int byteMin = -(int)Math.pow(2,8)/2;
        int byteMax = (int)Math.pow(2,8)/2 -1;
        int shortMin = -(int)Math.pow(2,16)/2;
        int shortMax = (int)Math.pow(2,16)/2 -1;
        int intMin = -(int)Math.pow(2,32)/2;
        int intMax = (int)Math.pow(2,32)/2 -1;
        long longMin = -(int)Math.pow(2,64)/2;
        long longMax = (int)Math.pow(2,64)/2 -1;


        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=byteMin && x<=byteMax)System.out.println("* byte");
                if(x>=shortMin && x<=shortMax)System.out.println("* short");
                if(x>=intMin && x<=intMax)System.out.println("* int");
                if(x>=longMin && x<=longMax)System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
