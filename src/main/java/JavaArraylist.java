import java.lang.reflect.Array;
import java.util.*;

public class JavaArraylist {

    // TODO implement iterator
    // TODO implement static function which prints the requests

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<List> listOfLists = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());

        for(int i=0; i<n; i++){
            int d = sc.nextInt();
            List<Integer> listOfInt= new ArrayList<>();
            for(int j=0; j<d; j++) {
                listOfInt.add(sc.nextInt());
            }
            listOfLists.add(listOfInt);
            sc.nextLine();
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i=0; i<q; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(listOfLists.get(x-1).get(y-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
            sc.nextLine();
        }
        sc.close();
    }
}
