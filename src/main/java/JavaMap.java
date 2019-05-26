import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            String number = in.nextLine();
            phoneBook.put(name, number);
        }
        while(in.hasNext()) {
            String queryName = in.nextLine();
            String result = phoneBook.get(queryName);
            if(result == null) {
                System.out.println("Not found");
            } else {
                System.out.printf("%s=%s\n", queryName, result);
            }
        }
    }
}


