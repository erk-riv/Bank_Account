package input;

import bankinginfo.NewAccount;

import java.util.Scanner;

public class SelectionRedirect {

    static int mainMenuChoice = UserInputValidator.mainMenuValidator();
    public static void mainMenuRedirect() {
        if (mainMenuChoice == 1) {
            System.out.println("1");
        } else if (mainMenuChoice == 2) {
            //Temp Variables to fill out
            String firstName, lastName;
            int socialSecurity, accountPin;
            double checkingDeposit, savingsDeposit;

            System.out.println("-----------------------------------------");
            System.out.println("""
                    Welcome to the Account Creation Portal!
                                      ....
                    Please fill in all the required information
                    to get started.
                    """);
            System.out.println("-----------------------------------------");

                    try {Thread.sleep(2000);} catch(Exception e) {}//Wait 2 seconds

            System.out.println("Loading....\n");

            Scanner newAccount = new Scanner(System.in);
            System.out.print("First Name: \t\t");
            firstName = newAccount.next();
            System.out.print("Last Name: \t\t");
            lastName = newAccount.next();
            System.out.print("Social Security #: \t");
            socialSecurity = newAccount.nextInt();
            System.out.print("Account Pin: \t\t");
            accountPin = newAccount.nextInt();
            System.out.print("Checking Deposit: \t");
            checkingDeposit = newAccount.nextDouble();
            System.out.print("Savings Deposit: \t");
            savingsDeposit = newAccount.nextDouble();

            NewAccount accountNumber = new  NewAccount(firstName, lastName, socialSecurity, accountPin, checkingDeposit, savingsDeposit);









        } else if (mainMenuChoice == 3) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
