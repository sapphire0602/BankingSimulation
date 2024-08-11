public class Customer extends Bank {
    protected String firstName;
    protected String lastName;
    protected String Address;
    long phoneNumber; //Nigeria Contact

    //--------------SETTERS----------------
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //-----------------SETTERS SET SUCCESSFULLY--------------------

    //--------------GETTERS-------------
    public String getfirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return Address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    //---------------GETTERS SET SUCCESSFULLY---------------------

    public Customer(){}

    public Customer(String firstName , String lastName , String Address , long phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.Address = Address;
        this.phoneNumber = phoneNumber; 

    }

}