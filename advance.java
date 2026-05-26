import java.util.Scanner;

public class advance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {   // infinite loop

            try {
                System.out.println("\nPlease Enter numerator number: ");
                double numerator = sc.nextDouble();

                System.out.println("Please Enter denominator number: ");
                double denominator = sc.nextDouble();

                if (denominator == 0) {
                    System.out.println("Error: Cannot divide by zero");
                } else {
                    double result = numerator / denominator;
                    System.out.println("Result is: " + result);
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next(); // clear wrong input
            }

            // Ask user if they want to continue
            System.out.println("\nDo you want to continue? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                break;  // exit loop
            }
        }

        sc.close();
        System.out.println("Program Ended.");
    }
}