import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Opolinto, Leo A.
 * 12/01/2024
 * Exception Handling Laboratory Challenge - Banking System
 * CC2-1B
 */
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message); 
    }
}

public class OpolintoL_ExceptionHandling{
    static void fundCheck (int withdrawalAmount, int balance) throws InsufficientFundsException{    
       if(withdrawalAmount > balance){  
  
        // throw an object of user defined exception  
        throw new InsufficientFundsException("Insufficient Funds! Your balance lacks the amount of funds necessary to complete this transaction. Try requesting a smaller value.");    
    }  
       else {   
        System.out.println("Amount successfully withdrawn.");   
        }   
     }
    public static void main (String[] args){
        Scanner gioScanner = new Scanner(System.in);
        int balance = 10000;
        int withdrawalAmount;
        System.out.println("Welcome, Ra'stil. Please enter the amount of funds you desire to withdraw, or enter \"0\" to exit. ");
        while(true){
            try{
                withdrawalAmount = gioScanner.nextInt();
                if(withdrawalAmount == 0){
                    System.out.println("Thank you for using the program, Ra'stil.");
                    break;
                }
                
                fundCheck(withdrawalAmount, balance);
                balance -= withdrawalAmount;
                System.out.println("Updated Balance: " + balance);
            }catch (InsufficientFundsException e){
                System.out.println("System Error: " + e.getMessage());
            }catch (InputMismatchException e){
                System.out.println("System Error: Invalid input! Please enter a numeric value.");
                gioScanner.nextLine();
            }
        }
    }
}
