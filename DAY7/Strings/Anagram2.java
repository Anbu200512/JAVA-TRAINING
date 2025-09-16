import java.util.Arrays;
public class Anagram2{
    public static void main(String args[]){
        String s1 = "race";
        String s2 = "cae";

        int[] count = new int[256];
        // System.out.println(arr1.length);
        for(int i = 0 ; i<s1.length() ; i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++){
            if(count[i]!=0){
                System.out.println("not a anagram");
               return;
            }
            }
             System.out.println("anagram");
        }
    
    }
