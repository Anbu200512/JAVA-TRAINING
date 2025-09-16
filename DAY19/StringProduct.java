import java.util.*;

public class StringProduct {
    String s = "3[a]2[bc]";
    Stack<String> strStack = new Stack<>();
    Stack<Integer> numStack = new Stack<>();
    String temp = "";

    public void decode() {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                numStack.push(ch - '0');
            }

            else if (ch == '[') {
                strStack.push(temp); 
                temp = ""; 
            }

            else if (ch == ']') {
                int repeat = numStack.pop();
                String prev = strStack.pop();
                temp = prev + temp.repeat(repeat);
            }

            else {
                temp += ch;
            }

        }

        System.out.println(temp);
    }
    public static void main(String[] args) {
         StringProduct s1 = new StringProduct();
         s1.decode();
    }
}
