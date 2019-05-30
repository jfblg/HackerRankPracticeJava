import java.util.*;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List> listOfLists = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            int d = sc.nextInt();
            List<Integer> listOfInt= new ArrayList<>();
            while(d-- >= 0) {
                listOfInt.add(sc.nextInt());

            }
            sc.nextLine();
            listOfLists.add(listOfInt);
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i=0; i<q; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
        }

        sc.close();

    }
}
