import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.security.Permission;

public class CanYouAccess {

    public static void main(String[] args) throws Exception {
        DoNotTerminate2.forbidExit();
        Integer integerWreapper = Integer.valueOf(9);

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o = new Object();// Must be used to hold the reference of the instance of the class Solution.Inner.Private

            //Write your code here ************
            //use Reflection API
            // Example: https://www.quora.com/How-do-I-access-a-private-method-in-Java

            Inner inner = new Inner();
            Class clazz = inner.getClass();
            Class[] foundClasses = clazz.getDeclaredClasses();
            Method method = foundClasses[0].getDeclaredMethod("powerof2");
            System.out.println(method.getName());
//            method.setAccessible(true);
//            for(Class c : foundClasses) {
//                System.out.println(c.getName());
//            }

//            System.out.println(method.invoke(foundClasses[0]));

            //End of your code ****************

            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        }//end of try

        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner

}//end of Solution

class DoNotTerminate2 { //This class prevents exit(0)

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}

