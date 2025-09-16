public class House {
    private Room room1;
    private Room room2;

    public House(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public void showAllDevices() {
        room1.showRoomDevices();
        room2.showRoomDevices();
    }

    public void controlAllDevices() {
        System.out.println("------Performing Functions-----");
        room1.controlDevices();
        room2.controlDevices();
    }
}
