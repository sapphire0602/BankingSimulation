public class Card extends Bank{
    public long number;
    public int cvv;
    public int expirationDate; //MM/YY
    public Customer owner;

    //------------------SETTERS----------------------------------

    public void setNumber(long number) {
        this.number = number;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
    //-------------------SETTERS SET SUCCESSFULLY---------------------

    //-------------------GETTERS--------------------------------------


    public long getNumber() {
        return number;
    }

    public int getCvv() {
        return cvv;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public Customer getOwner() {
        return owner;
    }
    //-------------------GETTERS SET SUCCESSFULLY------------------------

    public Card(){}

    public Card(long number , int cvv , int expirationDate , Customer owner) {
        this.number = number;
        this.cvv = cvv;
        this.expirationDate =expirationDate;
        this.owner = owner;
    }
}
