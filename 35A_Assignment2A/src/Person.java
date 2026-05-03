public class Person {
    private String name;
    private Address address;
    private int age;
    private String phoneNo;

    public Person(String name, Address address, int age, long phoneNo) {
        this.name = "";
        this.address = null;
        this.age = 0;
        this.phoneNo = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void print() {
        System.out.print(
                "Name: " + getName() +
                        "\nAddress: " + (getAddress() != null ? getAddress().toString() : "No value set") +
                        "\nAge: " + getAge() +
                        "\nPhone number: " + getPhoneNo()
                         );
    }
}
