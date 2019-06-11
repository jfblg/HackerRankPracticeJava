import java.util.Scanner;

interface Food {
    public String getType();
}

class Pizza implements Food {

    @Override
    public String getType() {
        return "Someone ordered a fastfood!";
    }
}

class Cake implements Food {

    @Override
    public String getType() {
        return "Someone ordered a desert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if(order == null) {
            return null;
        }
        if(order.equalsIgnoreCase("PIZZA")) {
            return new Pizza();
        }
        if(order.equalsIgnoreCase("CAKE")) {
            return new Cake();
        }

        return null;
    }
}

public class JavaFactoryPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FoodFactory foodFactory = new FoodFactory();

        Food food = foodFactory.getFood(sc.nextLine());

        System.out.println("The factory returned: " + food.getClass());
        System.out.println(food.getType());
    }
}
