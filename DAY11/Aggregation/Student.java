class Student {
    private int id;
    private String name;
    Department department;

    Student(int id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void showStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        department.showDept();
    }
}