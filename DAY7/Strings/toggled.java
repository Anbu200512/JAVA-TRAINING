import java.util.Scanner;
public class toggled{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter a string to toggle case:");
        String str = scan.nextLine();

        StringBuilder Toggled = new StringBuilder();
        for(int i = 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                Toggled.append(Character.toLowerCase(ch));
            }
            else if (Character.isLowerCase(ch)) {
                Toggled.append(Character.toUpperCase(ch));
            } else {
                Toggled.append(ch); 
            }
        }
        System.out.println("Original string: " + str);
        System.out.println("Toggled string: " + Toggled.toString());
    }
}