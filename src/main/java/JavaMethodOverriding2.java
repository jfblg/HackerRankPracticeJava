
class BiCycle {
    String defineMe() {
        return "a vehicle with a pedals";
    }
}

class MotorCycle extends BiCycle {
    @Override
    String defineMe() {
        return "a cycle with an engine";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + defineMe());
        String temp=super.defineMe(); // fix this
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}


public class JavaMethodOverriding2 {
    public static void main(String[] args) {
        MotorCycle pm = new MotorCycle();
    }
}
