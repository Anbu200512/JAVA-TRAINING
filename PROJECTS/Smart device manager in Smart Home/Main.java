public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room Light");
        Thermostat livingRoomThermostat = new Thermostat("Living Room Thermostat");

        livingRoomLight.setBrightness(75);
        livingRoomThermostat.setTemperature(22.5);

        Room livingRoom = new Room("Living Room", livingRoomLight, livingRoomThermostat);


        Light bedroomLight = new Light("Bedroom Light");
        Thermostat bedroomThermostat = new Thermostat("Bedroom Thermostat");

        bedroomLight.setBrightness(60);
        bedroomThermostat.setTemperature(25.0);

        Room bedroom = new Room("Bedroom", bedroomLight, bedroomThermostat);


        House myHouse = new House(livingRoom, bedroom);

        myHouse.showAllDevices();
        myHouse.controlAllDevices();
    }
}
