import java.util.*;
public class RemoveReptingElement{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = scan.nextLine();
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            boolean isduplicate = false;
            for(int j = 0 ; j<i ; j++){
                if(ch==s.charAt(j)){
                    isduplicate = true;
                    break;
                }
            }
            if(!isduplicate){
                System.out.print(ch);
            }
        }
    }
}