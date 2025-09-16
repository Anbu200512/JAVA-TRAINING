class Car{
    String model;
    String color;
    int year;

    Car(String model, String color , int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }

    void CarDisplay(){
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

class Owner extends Car {
    String ownerName;
    int ownerAge;

    Owner(String model,String color, int year,String ownerName ,int ownerAge){
        super(model,color,year);
        this.ownerName = ownerName;
        this.ownerAge = ownerAge;
    }

    void OwnerDisplay(){
        CarDisplay();
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Owner Age: " + ownerAge);
    }
}

public class vehicle{
    public static void main(String[] args) {
        Owner owner1 = new Owner("Toyota", "Red", 2020, "John Doe", 30);
        owner1.OwnerDisplay();
        System.out.println("<<<<---------------------->>>>");
        Owner owner2 = new Owner("Honda", "Blue", 2019, "Jane Doe", 28);
        owner2.OwnerDisplay();

    }
}
