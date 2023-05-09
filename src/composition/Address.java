package composition;

public class Address {

    private String streetAddress;
    private int zipCode;
    private String state;
    private String phone;

    public Address(String streetAddress, int zipCode, String state, String phone) {
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.state = state;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
