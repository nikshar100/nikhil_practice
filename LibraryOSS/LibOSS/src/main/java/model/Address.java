package model;

public class Address {
    private String houseNumber;
    private String streetName;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public Address(String houseNumber, String streetName, String city, String state, String zipCode, String country) {
        if (houseNumber == null) {
            throw new IllegalArgumentException("House number must be input.");
        }
        this.houseNumber = houseNumber;
        if (streetName == null) {
            throw new IllegalArgumentException("House number must be input.");
        }
        this.streetName = streetName;
        if (city == null) {
            throw new IllegalArgumentException("City name must be input.");
        }
        this.city = city;
        if (state == null) {
            throw new IllegalArgumentException("State name must be input.");
        }
        this.state = state;
        if (zipCode == null) {
            throw new IllegalArgumentException("ZIP code must be input.");
        }
        this.zipCode = zipCode;
        if (country == null) {
            throw new IllegalArgumentException("Country must be input.");
        }
        this.country = country;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        if (houseNumber == null) {
            throw new IllegalArgumentException("House number must be input.");
        }
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        if (streetName == null) {
            throw new IllegalArgumentException("Street name must be input.");
        }
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null) {
            throw new IllegalArgumentException("City must be input.");
        }
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state == null) {
            throw new IllegalArgumentException("State must be input.");
        }
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if (zipCode == null) {
            throw new IllegalArgumentException("ZIP Code must be input.");
        }
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null) {
            throw new IllegalArgumentException("Country must be input.");
        }
        this.country = country;
    }

    @Override

    public String toString() {
        return houseNumber + " " + streetName + ", " + city + " " + state + " " + zipCode + country;
    }

}
