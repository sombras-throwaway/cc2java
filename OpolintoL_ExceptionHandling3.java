import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Opolinto, Leo A.
 * 12/01/2024
 * Exception Handling Laboratory Challenge - Online Shopping Cart
 * CC2-1B
 */
class InvalidQuantity extends Exception{ //creates the custom invalidquantity exception  
    public InvalidQuantity(String message){
        super(message); //calls a constructor for the error message
    }
}

public class OpolintoL_ExceptionHandling3{
    static void quantityCheck (int userQuantity, int itemStock) throws InvalidQuantity{//function to detect if the user inputs something that calls for the invalidquantity exception     
       if(userQuantity > itemStock || userQuantity < 0){  //checks if the amount the user is trying to withdraw is greater than their current itemStock
  
        throw new InvalidQuantity("You are trying to withdraw an invalid amount. Please try a smaller quantity and make sure you are not entering a negative number.");//error message for the invalidquantity exception     
    }  
       else {   
        System.out.println("Amount successfully ordered.");//message if error is not present
        System.exit(0);//exits the program if the user successfully withdraws
        }   
     }
    public static void main (String[] args){
        Scanner gioScanner = new Scanner(System.in);
        int itemStock = 20;
        int userQuantity;
        System.out.println("Welcome, Ra'stil. Please enter the amount of funds you desire to withdraw, or enter \"0\" to exit. We have: " + itemStock + " Potions of Vigilance remaining.");//formats the itemStock directly while printing
        while(true){//keeps the program running regardless of the exceptions encountered.
            try{
                userQuantity = gioScanner.nextInt();
                if(userQuantity == 0){//exits the program when the user enters "0"
                    System.out.println("Thank you for using the program, Ra'stil.");
                    break;
                }
                
                quantityCheck(userQuantity, itemStock);//calls the function to check whether or not to call the exception based on the inputs of the user
            }catch (InvalidQuantity e){//catches the invalidquantity exception  if the quantityCheck functions throws or calls 1
                System.out.println("System Error: " + e.getMessage());
            }catch (InputMismatchException e){//detects inputmismatchexception, ensures that user enters correct inputs
                System.out.println("System Error: Invalid input! Please enter a numeric value.");
                gioScanner.nextLine();//clears the console otherwise inputmismatchsystem will never stop triggering
            }
        }
    }
}
