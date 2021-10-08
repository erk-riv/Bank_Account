package bankinginfo;

public class NewAccount {

    //Instance Variables to be used for object
    private String firstName;
    private String lastName;
    private int socialSecurity;
    //Class Variable to be used for object
    private static int accountNumber = 1000000000;
    //Instance Variables to be used for object
    private int accountPin;
    private double checkingBalance;
    private double savingsBalance;

    //Constructors for New Accounts
    public NewAccount() {
        firstName = "John";
        lastName = "Doe";
        socialSecurity = 000000000;
        accountNumber++;
        accountPin = 0000;
        checkingBalance = 0.00;
        savingsBalance = 0.00;
}

    public NewAccount(String firstName, String lastName, int socialSecurity, int accountPin, double checkingBalance, double savingsBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
        this.accountPin = accountPin;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
    }
    //Getter Methods
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getSocialSecurity() {return socialSecurity;}
    public int getAccountNumber() {return accountNumber;}
    public int getAccountPin() {return  accountPin;}
    public double getCheckingBalance() {return checkingBalance;}
    public double getSavingsBalance() {return savingsBalance;}
    //Setter Methods
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setSocialSecurity(int socialSecurity) {this.socialSecurity = socialSecurity;}
    public void setAccountNumber(int accountNumber) {NewAccount.accountNumber = accountNumber;}
    public void setAccountPin(int accountPin) {this.accountPin = accountPin;}
    public void setCheckingBalance(double checkingBalance) {this.checkingBalance = checkingBalance;}
    public void setSavingsBalance(double savingsBalance) {this.savingsBalance = savingsBalance;}

    public void displayNewInfo() {
        System.out.println("");
    }












}
