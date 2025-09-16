public class student{
    public static  void main(String[] args) {
        System.out.println("This is a student class");
    }
    static int startingregnum = 1000;
    int regnum;
    String name, dept ,college;

    student(String name, String dept, String college){
        regnum = startingregnum++;
        this.name = name;
        this.dept = dept;
        this.college = college;
    }
    

    void print(){
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Register Number: " + regnum);
        System.out.println("College Name: " + college);
    }
}


class info{
    public static void main(String args[]){
        student s1 = new student("anbu","ece","HICET");
        s1.print();
        // student s2 = new student("Sagar","cse","HICET");
        // s2.print();
        // student s3 = new student("Siva","eee","HICET"); 
        // s3.print();
    }
}