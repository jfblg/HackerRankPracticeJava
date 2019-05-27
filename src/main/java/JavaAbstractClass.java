import java.util.Scanner;

abstract class Book {
    String title;
    abstract void setTitle(String title);
    String getTitle() {
        return title;
    }
}

// implement a concrete class
class MyBook extends Book{
//    String title;
    void setTitle(String title) {
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }

}

public class JavaAbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();
    }
}
