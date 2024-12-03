import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.DecimalFormat;
/**
 * Opolinto, Leo A.
 * 12/01/2024
 * Exception Handling Laboratory Challenge - Banking System
 * CC2-1B
 */
class InvalidQuantityException extends Exception{ //creates the custom invalidquantityexception
    public InvalidQuantityException(String message){
        super(message); //calls a constructor for the error message
    }
}

public class OpolintoL_ExceptionHandling2 {
    static void quantityCheck (int stock, int desired) throws InvalidQuantityException{//function to detect if the user inputs something that calls for the invalidquantityexception
       if(desired > stock || desired < 0){  //checks if the quantity the user is attempting to order is greater than the available stock or a negative number
  
        throw new InvalidQuantityException("You are attempting to order an invalid quantity or our stock is inefficient. Please try another quantity, Ra'stil.");//error message for the invalidquantityexception
    }  
       else {   
        System.out.println("Amount quantity successfully ordered. Thank you, Ra'stil");//message if error is not present
        System.exit(0);
        }   
     }
    public static void main (String[] args){
        Scanner gioScanner = new Scanner(System.in);
        int stock = 20;
        int desired;
        System.out.println("Welcome, Ra'stil. Please enter how much you would like to order, or enter \"0\" to exit. You have: " + stock + " \"Arrow of Many Targets\" remaining.");//formats the balance directly while printing
        while(true){//keeps the program running until the user enters a valid quantity
            try{
                desired = gioScanner.nextInt();
                if(desired == 0){//exits the program when the user enters "0"
                    System.out.println("Thank you for using the program, Ra'stil.");
                    break;
                }
                quantityCheck(stock, desired);//calls the function to check whether or not to call the exception based on the inputs of the user
            }catch (InvalidQuantityException e){//catches the invalidquantityexception if the fundCheck functions throws or calls 1
                System.out.println("System Error: " + e.getMessage());
            }catch (InputMismatchException e){//detects inputmismatchexception, ensures that user enters project
                System.out.println("System Error: Invalid input! Please enter a numeric value.");
                gioScanner.nextLine();//clears the console otherwise inputmismatchexception will never stop triggering
            }
        }
    }
}
