public class Room {
    private String roomName;
    private SmartDevice device1;
    private SmartDevice device2;

    public Room(String roomName, SmartDevice device1, SmartDevice device2) {
        this.roomName = roomName;
        this.device1 = device1;
        this.device2 = device2;
    }

    public void showRoomDevices() {
        System.out.println("Room: " + roomName);
        System.out.println("- Device: " + device1.getDeviceName());
        System.out.println("- Device: " + device2.getDeviceName());
        System.out.println();
    }

    public void controlDevices() {
        device1.performFunction();
        device2.performFunction();
    }
}
