import java.util.LinkedList;
public class ReverseString {
    public static void main(String args[]){
    LinkedList<String> list = new LinkedList<>();
    String s = "To acquire knowledge in the latest technologies with an ability torecognize, analyze, and solve problems in computer science and engineering";

    String[] words = s.split(" ");
    for (String word : words) {
        list.add(word);
    }
    StringBuilder result = new StringBuilder();
    for(String s1 : list.reversed()){
        result.append(s1+" ");
    }
    System.out.print(result.toString());
}

}
