class Learner{
    private String learnerName;
    private int learnerAge;

    public String getName(){
        return learnerName;
    }

    public void setName(String learnerName){
        this.learnerName = learnerName;
    }

    public int getAge(){
        return learnerAge;
    }

    public void setAge(int learnerAge){
        this.learnerAge = learnerAge;
    }
}
public class Student{
    public static void main(String[] args) {
        Learner l1 = new Learner();
        l1.setName("Anbumani");
        l1.setAge(20);
        System.out.println("Learner Name: " + l1.getName());
        System.out.println("Learner Age: " + l1.getAge());
        }
}