
// reflection is a powerful tool to inspect fields of a class in runtime
// Example: you can inspect public fields of a method using getDeclaredMethods()

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;


class Student2{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

public class JavaReflectionAttributes {

    public static void main(String[] args) throws ClassNotFoundException{
        Class student = Class.forName("Student2");
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}