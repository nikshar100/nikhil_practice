import java.util.*;
public class Driver {
    Scanner in = new Scanner(System.in);

    public Person createPerson() {

        System.out.printf("\nEnter the name: ");
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

         Person[] drivers = new Person[3];

         drivers[0] = Mia;
         drivers[1] = Stacey;
         drivers[2] = Ross;

        for (Person p : drivers ) {
            if (p != null) {
                p.print();
            }
        }

    }

}
