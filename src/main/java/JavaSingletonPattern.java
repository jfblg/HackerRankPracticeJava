
//The singleton pattern is a design pattern that restricts the instantiation of a class to one object.
//This is useful when exactly one object is needed to coordinate actions across the system.

public class JavaSingletonPattern {

    // create an object - use private static
    private static JavaSingletonPattern instance = new JavaSingletonPattern();

    // public string variable
    public String str;

    // private constructor so that this class can not be instantiated
    private JavaSingletonPattern(){}

    // get only 1 object available
    public static JavaSingletonPattern getInstance() {
        return instance;
    }

    // method
    public void showMessage(){
        System.out.println("Hello World");
    }

}
