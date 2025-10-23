import java.util.Scanner;

public class CoffeeShopMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Shop Menu");
        System.out.println("Menu:");
        System.out.println("1. Add Coffee: A - Americano - 3.00");
        System.out.println("2. Add Coffee: C - Cappucino - 3.75");
        System.out.println("3. Add Coffee: L - Latte - 4.00");
        System.out.println("4. Add Coffee: E - Espresso - 2.50");
        System.out.println("Please enter your choice:");

        char choice = input.next().toUpperCase().charAt(0);

        switch (choice) {
            case 'A':
                System.out.println("Americano - 3.00");
                break;
            case 'C':
                System.out.println("Cappucino - 3.75");
                break;
            case 'L':
                System.out.println("Latte - 4.00");
                break;
            case 'E':
                System.out.println("Espresso - 2.50");
                break;
            default:
                System.out.println("Invalid choice");
        }
        input.close();
    }
}