public class Room {
    public int roomNumber;
    public Buildings building;
    public int capacity;

    public Room(int roomNumber, Buildings building, int capacity) {
        this.roomNumber = roomNumber;
        this.building = building;
        this.capacity = capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Buildings getBuilding() {
        return building;
    }

    public void setBuilding(Buildings building) {
        this.building = building;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return("Room number: " + roomNumber +
                "\n Building: " + getBuilding() +
                "\n Capacity: " + capacity);
    }
}
