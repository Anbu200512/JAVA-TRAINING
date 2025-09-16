import java.util.Scanner;
public class Fibonacci{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci sequence:");
        int n = scan.nextInt();
        
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for(int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(); // For a new line after the sequence
    } 

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}