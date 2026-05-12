public class Address {
    private String addressL1;
    private String addressL2;
    private String city;
    private String state;
    private long zipCode;
    private String country;

    public Address(String addressL1, String addressL2, String city, String state, long zipCode, String country) {
        this.addressL1 = addressL1;
        this.addressL2 = addressL2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getAddressL1() {
        return addressL1;
    }

    public void setAddressL1(String addressL1) {
        this.addressL1 = addressL1;
    }

    public String getAddressL2() {
        return addressL2;
    }

    public void setAddressL2(String addressL2) {
        this.addressL2 = addressL2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override

    public String toString() {
        return(addressL1 + "\n"
                + addressL2 + "\n"
                + city + ", " + state + " " + zipCode + "\n"
                + country);
    }
}
