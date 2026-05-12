import java.util.*;

public class Customer {
    private String custName;
    private Address custAddress;
    private String custPK;
    private String custPhone;
    private String custEmail;
    private List <Device> devices = new ArrayList<>();

    public Customer(String custName, Address custAddress, String custPK, String custPhone, String custEmail) {
        this.custName = custName;
        this.custAddress = custAddress;
        this.custPK = custPK;
        this.custPhone = custPhone;
        this.custEmail = custEmail;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Address getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(Address custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustPK() {
        return custPK;
    }

    public void setCustPK(String custPK) {
        this.custPK = custPK;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    @Override
    public String toString() {
        return("" +
                "Name: " + custName +
                "\nAddress: " + getCustAddress().toString() +
                "\nPK: " + custPK +
                "\nPhone: " + custPhone +
                "\nEmail: " + custEmail);

    }
}
