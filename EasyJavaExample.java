import java.util.Scanner;

public class EasyJavaExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        // Validate input
        if (name.isEmpty()) {
            System.out.println("You didn't enter a name!");
        } else {
            System.out.println("Hello, " + name + "! Welcome to Java.");
        }

        scanner.close();
    }
}
