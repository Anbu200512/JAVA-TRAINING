import java.util.Arrays;
public class Anagram{
    public static void main(String args[]){
        String s1 = "race";
        String s2 = "care";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray(); 

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
    if(Arrays.equals(arr1 , arr2)){
        System.out.println("anagram");
    }
    else{
        System.out.println("not a anagram");
    }
    }
}