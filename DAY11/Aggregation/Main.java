public class Main{
    public static void main(String[] args) {
        Department dep = new Department("ECE");
        Student stu = new Student(6002, "Anbumani", dep);
        stu.showStudent();
    }
}