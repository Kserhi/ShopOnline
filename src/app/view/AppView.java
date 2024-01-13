package app.view;

import java.util.Locale;
import java.util.Scanner;

public class AppView {

    private final Scanner scanner = new Scanner(System.in);

    public String[] getData() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Enter buyer name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter buyer phone: ");
        String phone = scanner.nextLine().trim();
        System.out.print("Enter product quantity: ");
        String quantity = scanner.nextLine().trim();
        System.out.print("Enter product price, USD: ");
        String price = scanner.nextLine().trim();
        System.out.println("Do you need delivery?\n" +
                "(give an answer in the form of 'yes','no' or '+','-')");
        String delivery = scanner.nextLine().trim();
        scanner.close();
        return new String[]{name, phone, quantity, price, delivery};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}