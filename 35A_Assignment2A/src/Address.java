public class Address {
    private String houseNum;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String houseNum, String street, String city, String state, String zipCode) {
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode  ;
    }

    @Override
    public String toString() {
        return(houseNum + " " + street + ", " + city + " " + state + ", " + zipCode);
    }




}


