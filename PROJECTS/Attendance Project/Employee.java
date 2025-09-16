class Employee extends Person{
    private String department;
    static int employeeCount = 0;

    public Employee(String name, int id, String department) {
        super(name, id);
        this.department = department;
        employeeCount++;
    }

    String getDepartment(){
        return department;
    }
      public void setDepartment(String department) {
        this.department = department;
    }

    public static void showEmployeeCount() {
        System.out.println("Total Employees Created: " + employeeCount);
    }

    public void showDetails(){
        System.out.println("Employee Details:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Department: " + department);
    }
}