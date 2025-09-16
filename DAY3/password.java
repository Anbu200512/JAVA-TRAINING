import java.util.Scanner;
public class password{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
         System.out.println(" enter the password");
        String pwd = scan.nextLine();
        int n = pwd.length();
        Boolean lc = false;
        Boolean uc = false;
        Boolean spl = false;
            for(int i=0 ; i < n ; i++ ){
            if(Character.isUpperCase(pwd.charAt(i))){
                uc=true;
            }
            
            if (Character.isLowerCase(i)) {
                    lc = true;
                } 
            
             if (!Character.isLetterOrDigit(i)) {
                    spl = true;
        }
        if(n>=8 && uc==true && lc==true && spl==true){
            System.out.println("Your password is Strong");
        }
        else{
            System.out.println("Your password is not Strong so enter the strong password");
            pwd = scan.nextLine();
        }
        }
    }
}