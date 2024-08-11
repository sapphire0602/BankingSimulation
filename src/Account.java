public class Account {
    public long number;
    public Customer owner;
    public boolean active = true;
    public double balance;

    //---------------SETTERS-------------------
    public void setNumber(long number){
        this.number = number;
    }
    public void setOwner(Customer owner){
        this.owner = owner;
    }
    public void setActive(boolean active){
        this.active = active;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    //-----------------SETTERS SET SUCCESSFULLY--------------------

    //-----------------GETTERS------------------------------------

    protected long getNumber() {
        return number;
    }

    public Customer getOwner() {
        return owner;
    }

    public boolean isActive() {
        return active;
    }

    public double getBalance() {
        return this.balance;
    }
    //----------------------GETTERS SET SUCCESSFULLY---------------------
    public Account(){}
    public Account (long number , boolean active , Customer owner , double balance ){
        this.number = number;
        this.owner = owner;
        this.active = true;
        this.balance = 0.0;
    }

}
