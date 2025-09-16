import java.util.List;
import java.util.ArrayList;
class list{
    public static void main(String []args){
        List<String> name = new ArrayList<>();
        name.add("anbu");
        name.add("rasheed");
        name.add("abe");
        name.add("dhana");
        name.add(" ");
        name.remove(3);
        name.remove("abe");
        System.out.println(name.size());
        // System.out.println()
    }
} 