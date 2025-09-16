public class Light extends SmartDevice {
    private int brightnessLevel;

    public Light(String deviceName) {
        super(deviceName);
    }

    public void setBrightness(int level) {
        this.brightnessLevel = level;
    }

    public void performFunction() {
        System.out.println("Light " + getDeviceName() + " is adjusting brightness to " + brightnessLevel + "%");
    }
}
