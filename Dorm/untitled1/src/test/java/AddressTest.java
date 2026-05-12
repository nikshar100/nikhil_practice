import org.junit.jupiter.api.Test;

public class AddressTest {
    private long number;
    private String street;
    private String city;
    private String state;
    private long zip;

    public AddressTest(long number, String street, String city, String state, long zip) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return number + " " + street + ", " + city + " " + state + " " + zip;
    }

}
