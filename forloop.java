import java.util.Scanner;
public class forloop{
    public static void main(String[] args) {
        try
        (Scanner sc = new Scanner(System.in)) { 
        System.out.println("Please Enter numerator  number: ");
        double numerator = sc.nextDouble();

        System.out.println("Please Enter denominator number: ");
        double denominator = sc.nextDouble();

        double result = numerator/denominator;
        System.out.println("result is: " + result);
            
        } catch (Exception e) {
            System.out.println("Error Please enter non zero ");
        }

    }

}