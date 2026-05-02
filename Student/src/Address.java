public class Address {
    private long number;
    private String street;
    private String city;
    private String state;
    private long zip;

    public Address(long number, String street, String city, String state, long zip) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void showAddress() {
        System.out.printf("%d %s %s %s %d", number, street, city, state, zip);

    }
}
