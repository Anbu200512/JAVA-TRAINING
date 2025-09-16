public class Thermostat extends SmartDevice {
    private double temperature;

    public Thermostat(String deviceName) {
        super(deviceName);
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }

    public void performFunction() {
        System.out.println("Thermostat " + getDeviceName() + " is set to " + temperature + "°C");
    }
}
