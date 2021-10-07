package input;
import java.util.Scanner;

public class UserInput {
    public static int mainMenuUserInput() {
        Scanner mainMenu = new Scanner(System.in);
        int mainMenuChoice;
        while ((mainMenuChoice = mainMenu.nextInt()) >= 1 && mainMenuChoice <=4){
            if (mainMenuChoice == 1) {
                System.out.println("1");
            } else if (mainMenuChoice == 2) {
                System.out.println("2 e");
            } else if (mainMenuChoice == 3) {
                System.out.println("3");
            } else {
                System.out.println("4");
            }
        } 
        return mainMenuChoice;

    }
}
