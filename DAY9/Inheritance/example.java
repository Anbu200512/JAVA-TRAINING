class College{
    static int code =1000;
    String collegeName;
    int collegeCode;

    College(String collegeName , int collegeCode , int code){
        this.collegeName = collegeName;
        this.collegeCode = code++;
    }

    void display(){
        System.out.println("college Nmae : "+collegeName);
        System.out.println("college Code : "+collegeCode);
    }
}
class Department{
    static int snum = 160;
    String departmentName;
    int numberOfStudents;

    Department(String departmentName , int numberOfStudents,int snum){
        this.departmentName = departmentName;
        this.numberOfStudents = snum++;
    }
    void display(){
        System.out.println("Department Name: " + departmentName);
        System.out.println("Number of Students: " + numberOfStudents);
    }
}

public class example{
    public static void main(String[] args) {
        College clg = new College("HINDUSTHAN",102, 1000);
        Department dept1 = new Department("CSE", 60, 160);
        clg.display();
        System.out.println("---------------------->");
        dept1.display();
    }
}