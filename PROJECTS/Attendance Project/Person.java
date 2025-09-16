abstract class Person {
    private String name;
    private int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    void PersonDisplay() {
        System.out.println("Name : " + getName());
        System.out.println("ID : " + getId());
    }

    abstract void showDetails();
}