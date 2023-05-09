package composition;

public class Student { // removed 'extends' so Student is not a subclass of Address

    Address myAddress;// add reference to the class

    private String name;
    private int age;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        //super(streetAddress, zipCode, state, phone); remove reference to superclass, not using anymore
        //this.name = name;  change to use setter
        //this.age = age;  change to use setter
        setName(name);
        setAge(age);

        // instantiate the reference class
        myAddress = new Address(streetAddress,zipCode,state,phone);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // add getters/setters to set/obtain info from the reference class
    public void setStreetAddress(String streetAddress){
        myAddress.setStreetAddress(streetAddress);
    }

    public String getStreetAddress(){
        return myAddress.getStreetAddress();
    }

    public void setMyZipCode(int zipCode){
        myAddress.setZipCode(zipCode);
    }

    public int getMyZipCode(){
        return myAddress.getZipCode();
    }

    public void setState(String state){
        myAddress.setState(state);
    }

    public String getState(){
        return myAddress.getState();
    }
}
