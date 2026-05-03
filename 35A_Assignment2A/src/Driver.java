import java.util.*;
public class Driver {

    public Person createPerson() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = in.nextLine();

        System.out.print("\nEnter the address: ");
        Address address = createAddress();

        System.out.print("\nEnter the age: ");
        int age = in.nextInt();
        in.nextLine();

        System.out.printf("\nEnter the phone number: ");
        String phoneNum = in.nextLine();

        return new Person(name, address, age, phoneNum);
    }

    public Address createAddress() {

        Scanner in = new Scanner(System.in);

        System.out.printf("\nEnter the house number: ");
        String houseNum = in.nextLine();

        System.out.printf("\nEnter the street: ");
        String houseStreet = in.nextLine();

        System.out.printf("\nEnter the city: ");
        String houseCity = in.nextLine();

        System.out.printf("\nEnter the state: ");
        String houseState = in.nextLine();

        System.out.printf("\nEnter the ZIP code: ");
        String houseZip = in.nextLine();

        return new Address(houseNum, houseStreet, houseCity, houseState, houseZip);
    }
    public static void main(String[] args) {
        Driver driver = new Driver();
        Person Stacey = driver.createPerson();
        Stacey.print();

        Person Ross = driver.createPerson();
        Ross.print();

        Person Mia = driver.createPerson();
        Mia.print();

    }

}
