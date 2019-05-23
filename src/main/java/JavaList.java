import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> L = new ArrayList<>();

        for(int i=0; i<n; i++){
            L.add(in.nextInt());
        }
        int Q = in.nextInt();
        in.nextLine();
        int index;
        int value;

        while(Q-- > 0) {
            String operation = in.nextLine();
            if(operation.equals("Insert")) {
                index = in.nextInt();
                value = in.nextInt();
                in.nextLine();
                L.add(index, value);

            } else if (operation.equals("Delete")) {
                index = Integer.parseInt(in.nextLine());
                L.remove(index);
            } else {
                System.out.println("Invalid input!");
            }
        }
        in.close();

        ListIterator<Integer> listItr = L.listIterator();

        while(listItr.hasNext()){
            System.out.printf("%d", listItr.next());
            if(listItr.hasNext()) {
                System.out.printf(" ");
            } else {
                System.out.printf("\n");
            }
        }
        System.out.println();
    }

}
