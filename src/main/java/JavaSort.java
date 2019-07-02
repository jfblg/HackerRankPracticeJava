<<<<<<< HEAD
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
=======
import com.sun.tools.javap.InstructionDetailWriter;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
>>>>>>> origin/master
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }
<<<<<<< HEAD
    public String getName() {
        return name;
=======

    public String getFname() {
        return fname;
>>>>>>> origin/master
    }

    public double getCgpa() {
        return cgpa;
    }
}

<<<<<<< HEAD
=======
class SolutionSortComparator implements Comparator<Student> {

    /**
     * if cgpa is same, sort based on names
     * if names are same, sort based on their id
     */

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getCgpa() < s2.getCgpa()) {
            return 1;
        } else if (s1.getCgpa() > s2.getCgpa()) {
            return -1;
        } else {
            if (s1.getFname().compareTo(s2.getFname()) > 0) {
                return 1;
            } else if (s1.getFname().compareTo(s2.getFname()) < 0) {
                return -1;
            } else {
                if(s1.getId() < s2.getId()) {
                    return 1;
                } else if (s1.getId() > s2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
>>>>>>> origin/master

public class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
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
=======
        int testCases = Integer.parseInt(sc.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases > 0) {

            int id = sc.nextInt();
            String fname = sc.next();
            double cgpa = sc.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new SolutionSortComparator());

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }

>>>>>>> origin/master
    }
}
