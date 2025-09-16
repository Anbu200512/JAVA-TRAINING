import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int number = scan.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * factorial(n - 1); 
        }
    }
}