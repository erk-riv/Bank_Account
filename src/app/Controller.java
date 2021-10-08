package app;
import java.util.Scanner;
import input.UserInputValidator;
import input.SelectionRedirect;

public class Controller {
    public static void main(String[] args) {

        Scanner mainMenu = new Scanner(System.in);

        //Display Welcome & Main Menu
        System.out.println("-----------------------------------------");
        System.out.println("\t\tWelcome to Bank of NYC");
        System.out.println("-----------------------------------------");
        System.out.println("Please Select an Option Below:");
        System.out.println("""
                1 - Account Information
                2 - Setup a New Account
                3 - Deposit Money
                4 - Withdraw Money
                """);
        System.out.print("Option: ");
        SelectionRedirect.mainMenuRedirect();
        //UserInputValidator.mainMenuValidator();
        System.out.println("");
    }
}
