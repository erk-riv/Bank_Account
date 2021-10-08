package input;
import java.util.Scanner;

//This method will check to make users input is a valid option
public class UserInputValidator {

    public static int mainMenuValidator() {

        int mainMenuChoice;

        while (true) {
            Scanner mainMenu = new Scanner(System.in);
            mainMenuChoice = mainMenu.nextInt();
                 if (mainMenuChoice >= 1 && mainMenuChoice <= 4) {
                     System.out.println("Processing....");
                     break;
                 } else {
                     System.out.print("Please enter an a valid option: ");
            }
        }
        return mainMenuChoice;





        }


    }