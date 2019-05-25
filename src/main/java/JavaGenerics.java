
// Generic methods allow to handle multiple data types using a single method
// printArray must accept Integer and string arrays and print them

import java.lang.reflect.Method;
import java.util.List;

class Printer{
    public static <T> void printArray(T[] list) {
        for(T x : list) {
            System.out.println(x);
        }
    }
}

public class JavaGenerics {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"a", "b"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

        int count = 0;

        for(Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray")){
                count++;
            }
        }

        if(count > 1) System.out.println("Method overloading is not allowed!");
    }
}
