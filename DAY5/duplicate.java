import java.util.Scanner;
public class duplicate{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        int len = input.length();
        for (int i = 1; i < len-1; i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                System.out.print(input.charAt(i));
            }
        }
    }
}