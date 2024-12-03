import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.DecimalFormat;
/**
 * Opolinto, Leo A.
 * 12/01/2024
 * Exception Handling Laboratory Challenge - Banking System
 * CC2-1B
 */
class InsufficientFundsException extends Exception{ //creates the custom insufficientfundsexception 
    public InsufficientFundsException(String message){
        super(message); //calls a constructor for the error message
    }
}

public class OpolintoL_ExceptionHandling{
    static void fundCheck (double withdrawalAmount, double balance) throws InsufficientFundsException{//function to detect if the user inputs something that calls for the insufficientfundsexception    
       if(withdrawalAmount > balance){  //checks if the amount the user is trying to withdraw is greater than their current balance
  
        throw new InsufficientFundsException("Insufficient Funds! Your balance lacks the amount of funds necessary to complete this transaction. Try requesting a smaller value.");//error message for the insufficientfundsexception    
    }  
       else {   
        System.out.println("Amount successfully withdrawn.");//message if error is not present   
        }   
     }
    public static void main (String[] args){
        Scanner gioScanner = new Scanner(System.in);
        DecimalFormat gioFormat = new DecimalFormat("$#,##0.00");//creates formatter to format our double values to usd
        double balance = 10000;
        double withdrawalAmount;
        System.out.println("Welcome, Ra'stil. Please enter the amount of funds you desire to withdraw, or enter \"0\" to exit. You have: " + (gioFormat.format(balance)) + " remaining.");//formats the balance directly while printing
        while(true){//keeps the program running regardless of the exceptions encountered.
            try{
                withdrawalAmount = gioScanner.nextDouble();
                if(withdrawalAmount == 0){//exits the program when the user enters "0"
                    System.out.println("Thank you for using the program, Ra'stil.");
                    break;
                }
                
                fundCheck(withdrawalAmount, balance);//calls the function to check whether or not to call the exception based on the inputs of the user
                balance -= withdrawalAmount;
                System.out.println("Updated Balance: " + (gioFormat.format(balance)));
            }catch (InsufficientFundsException e){//catches the insufficientfundsexception if the fundCheck functions throws or calls 1
                System.out.println("System Error: " + e.getMessage());
            }catch (InputMismatchException e){//detects inputmismatchexception, ensures that user enters project
                System.out.println("System Error: Invalid input! Please enter a numeric value.");
                gioScanner.nextLine();//clears the console otherwise inputmismatchsystem will never stop triggering
            }
        }
    }
}
