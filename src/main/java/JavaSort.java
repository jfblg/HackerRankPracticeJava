import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}


public class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(n-- > 0) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            Student s = new Student(id, name, cgpa);
            studentList.add(s);
        }

        for(Student s : studentList) {
            System.out.println(s.getName());
        }
    }
}
