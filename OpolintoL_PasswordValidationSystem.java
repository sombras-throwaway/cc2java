package Activities;
import java.util.Scanner;
/**
 * Opolinto, Leo A.
 * CC2-1B
 * Classroom Attendance System
 */
public class OpolintoL_PasswordValidationSystem {
    public static void main(String args[]){
        Scanner gioScanner = new Scanner(System.in);//scanner declaration and variable declaration
        String userInput;
        boolean inputValidity, numbersPresent, containsUppercase, properLength;
        
        System.out.print("Enter your password. ");//prompts for user input
        userInput = gioScanner.nextLine();
        inputValidity = false;//initializes boolean values
        properLength = false;
        numbersPresent = false;
        containsUppercase = false;
        if (userInput.matches(".*\\d.*")){//initially checks if the password already fulfills the conditions before starting the main loop
            numbersPresent = true;
        }
        if (userInput.matches(".*[A-Z].*")){
            containsUppercase = true;
        }
        if(userInput.length() >= 8){
            properLength = true;
        }
        if(properLength && containsUppercase && numbersPresent){
            inputValidity = true;
        }
        while(!inputValidity){//loop continues indefinitely until the user enters a password that fulfills all 3 conditions
            System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            System.out.print("Enter your password. ");
            userInput = gioScanner.nextLine();
            if (userInput.matches(".*\\d.*")){
                numbersPresent = true;
            }
            if (userInput.matches(".*[A-Z].*")){
                containsUppercase = true;
            }
            if(userInput.length() >= 8){
                properLength = true;
            } 
            if(properLength && containsUppercase && numbersPresent){
                inputValidity = true;
            }
        }
        System.out.print("Your password is valid!");
    }
}
