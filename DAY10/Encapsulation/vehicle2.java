
abstract class Car{
    private String model;
    private String color;
    private int year;

    Car(String model, String color , int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }

    String getModel(){
        return model;
    }

    String getColor(){
        return color;
    }

    int getYear(){
        return year;
    }
    abstract void start();
    abstract void stop(); 
    
}

class Owner extends Car {
    private String ownerName;
    private int ownerAge;

    Owner(String model,String color, int year,String ownerName ,int ownerAge){
        super(model,color,year);
        this.ownerName = ownerName;
        this.ownerAge = ownerAge;
    }

    String getOwnerName(){
        return ownerName;
    }

    int getOwnerAge(){
        return ownerAge;
    }

    void ownerdisplay(){
        System.out.println("Model : " + getModel());
        System.out.println("Color : " + getColor());
        System.out.println("Year : " + getYear());
        System.out.println("Owner Name : " + getOwnerName());
        System.out.println("Owner Age : " + getOwnerAge());
    }

    void start(){
        System.out.println("Start with Key");
    }
    void stop(){
        System.out.println("Stop while in trafic");
    }

}

public class vehicle2{
    public static void main(String[] args) {
        Owner o1 = new Owner("BMW", "BLACK", 2025, "ANBUMANI", 20);
    
        o1.ownerdisplay();
        o1.start();
        o1.stop();

    }
}
