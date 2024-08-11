import java.util.ArrayList;

public class Bank extends Account {
    public String name;
    public String address;
    public long accountNo;
    //public double phoneNumber;
    public ArrayList<Account>accounts;
    public ArrayList<Customer>customers;

    public Bank() {
        //name = new name();
        customers = new ArrayList<>();
        accounts = new ArrayList<>();
    }


    //---------------SETTERS------------------------------
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    protected void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void accountNo(long accountNo){
        this.accountNo = accountNo;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
    public void addCustomers(Customer customer){
        customers.add(customer);
    }

    //---------------GETTERS------------------------------

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getAccountNo(){
        return accountNo;
    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }


    public Bank(String name, String address , ArrayList<Account> accounts ,ArrayList<Customer> customers){
        this.name = name;
        this.address = address;
        this.accounts =new ArrayList<>();
        this.customers =new ArrayList<>();
    }

    public void  registerCustomer(String firstName , String lastName , String address , long phoneNumber) {
        Customer newCustomer = new Customer(firstName , lastName , address , phoneNumber);
        this.addCustomers(newCustomer);
        this.name = firstName + lastName ;
        this.accountNo = phoneNumber;
        this.address = newCustomer.getAddress();
        String customerId = "CUS" + (customers.size() + 12345);
        System.out.println("Customer registered ---" +  newCustomer.getfirstName() +"   " + newCustomer.getLastName() + " | " + "Address is :" + newCustomer.getAddress() + " | " + "Contact : +234" + newCustomer.getPhoneNumber()) ;
        System.out.println("Your customer ID is : " + customerId);
    }

        public void createAccount(Customer owner , boolean active , double balance){
         Account newAccount = new Account(number ,  active ,  owner ,  balance);
         this.balance =balance;
         this.addAccount(newAccount);
         System.out.println("Account created for : " + newAccount.getOwner() + "  is account active : " + newAccount.isActive() +"  and balance is : " + this.balance );
        }

        public void debitAccount(Account account , float amt){
        this.balance = this.balance - amt;
        if (this.balance >= 0){
            System.out.println("Account debited --- " + "#" + amt + "||" + "BALANCE ---" + "#" + this.balance);
        }
        else {
            System.out.println("Insufficient balance;  Please try Again.");
        }
        }

        public void creditAccount(Account account , float amt) {
            this.balance = this.balance + amt;
            System.out.println("Account credited --- " + "#" + amt + "||" + "Account Balance ---" + "#" + this.balance);
        }

        /*public void giveLoan(Account account , float amt) {
            //this.balance = balance ;
            if (this.balance >= balance * 0.5) {
                this.balance = balance* 0.5 ;
                System.out.println("Amount that can be loaned is : ---" + this.balance);
            } else if (this.balance <= balance * 0.5){
                System.out.println("you should have 50% of the money you want to borrow");
            }
            //this.balance = balance*0.5 ;
            else {
                this.balance = balance + amt ;
                System.out.println("Loan successfully delivered ----" + this.balance );
            }
        } */
        public void getAccountDetails (Account account ) {
            System.out.println("A/C no. :" + this.accountNo + "||" + "Account Name:" + this.name +"||" + " Address : " + this.address +"||" + "Account Balance:" + this.balance);
        }

    public void giveLoan(Account account , float amt) {
        //this.balance = balance ;
        this.balance = balance + amt ;
        if (this.balance >= balance * 0.5) {
            this.balance = balance* 0.5 ;
            System.out.println("Amount that can be loaned is : ---" + this.balance);
        } else if (this.balance <= balance * 0.5){
            System.out.println("you should have 50% of the money you want to borrow");
        }
        //this.balance = balance*0.5 ;
        else {
            //this.balance = balance + amt ;
            System.out.println("Loan successfully delivered ----" + this.balance );
        }
    }
    }



