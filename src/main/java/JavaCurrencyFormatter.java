import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);

        Locale inLocale = new Locale("en", "India");
        Currency inCurrency = Currency.getInstance("INR");

        NumberFormat inFormat = NumberFormat.getCurrencyInstance(inLocale);
        inFormat.setCurrency(inCurrency);
        String india = inFormat.format(payment).replace("INR", "Rs.");


        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = frFormat.format(payment);

        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = cnFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
