public class Student {
    String name;
    long studentID;
    double gpa;
    Address address;
    Room room;

    public Student(String name, long studentID, double gpa, Address address, Room room) {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
        this.address = address;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void printInfo() {
        System.out.printf(
                "Student Name: " + name +
                "Student ID " + studentID +
                "Student GPA: " + gpa +
                "Address: " + getAddress().toString() +
                "Room: " + getRoom().toString());
    }
}
