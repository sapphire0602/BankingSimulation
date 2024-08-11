
import java.util.ArrayList;
import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.active = false;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            long totalMilliSeconds = System.currentTimeMillis();
            long totalSeconds = totalMilliSeconds/1000;
            long currentSeconds = totalSeconds % 60;

            long totalMinutes = totalSeconds /60;
            long currentMinutes = totalMinutes % 60;

            long totalHour = totalMinutes / 60;
            long currentHour = totalHour % 60;

            System.out.println(currentHour + " : " + currentMinutes + " : " + currentSeconds);
            
            System.out.println("1.Register customer");
            System.out.println("2. Create Account");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Request for loan");
            System.out.println("6. Get account details");
            System.out.println("7. Exit");

            System.out.println("Enter an option : ");
            int option = scanner.nextInt();

            switch (option){
                case 1 : //REGISTER CUSTOMER
                    System.out.println("Enter first name");
                    String firstName = scanner.next();
                    scanner.nextLine();
                    System.out.println("Enter last name");
                    String lastName = scanner.next();
                    System.out.println("Enter Address");
                    String address = scanner.next();
                    System.out.println("Enter phone Number (Nigerian number)");
                    long phoneNumber = scanner.nextLong();
                    System.out.println("Customer registered");
                    bank.registerCustomer(firstName, lastName, address, phoneNumber);
                    bank.active = true;

                    break;
                case 2 ://CREATE ACCOUNT
                    if (bank.active) {
                        scanner.nextLine();
                        System.out.println("Enter owner's name ");
                        Customer owner = new Customer();
                        scanner.nextLine();
                        System.out.println("Is your account active (true or false) : ");
                        boolean isActive = scanner.nextBoolean();
                        System.out.println("Do you want to deposit ? , if yes , Enter amount : ");
                        double balance = scanner.nextDouble();
                        System.out.println("Account created");
                        bank.createAccount(owner, isActive , balance);
                    } else {
                        System.out.println("Register as customer first");
                    }
                    break;

                case 3 : //WITHDRAW
                    if (bank.active){
                        scanner.nextLine();
                        System.out.println("Enter amount to withdraw");
                        float amt = scanner.nextFloat();
                        Account account = new Account();
                        bank.debitAccount(account , amt);
                    }

                    else{
                        System.out.println("Create account first");
                    }
                    break;

                case 4 :
                    if (bank.active){
                        scanner.nextLine();
                        System.out.println("Enter amount to deposit");
                        float amt = scanner.nextFloat();
                        Account account = new Account();
                        bank.creditAccount(account , amt);
                    }

                    else{
                        System.out.println("Create account first");
                    }
                    break;
                case 5 :
                    if (bank.active){
                        scanner.nextLine();
                        System.out.println("Enter amount of loan to receive");
                        float amt = scanner.nextFloat();
                        Account account = new Account();
                        bank.giveLoan(account , amt);
                    }

                    else{
                        System.out.println("Create account first");
                    }

                case 6 :
                    if (bank.active){
                        Account account = new Account();
                        bank.getAccountDetails(account);
                    }
                    else{
                        System.out.println("Create account first");
                    }
                    break;

                case 7 : //Exit
                    System.out.println("THANK YOU, AND HAVE A NICE DAY");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Option,Please try again");
                    System.out.println("------------------------");
            }
        }
    }
}
