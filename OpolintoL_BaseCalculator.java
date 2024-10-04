import java.util.Scanner;
/**
 *
 * @author M303User
 */
public class OpolintoL_BaseCalculator {
    public static void main(String args[]){
        Scanner gioScanner = new Scanner(System.in);
        String userInput = "";
        
        while (1 == 1){
            //Ask user for origin number system
            System.out.println("Please enter the desired origin number system (2-16) for the first number. Enter \"STOP\" at any time to terminate the program.");
            userInput = gioScanner.nextLine().toUpperCase();
           
            if(userInput.equals("STOP")){//Input handling
                break;
            }
            int originSystem = Integer.parseInt(userInput);
            if (originSystem < 2 || originSystem > 16){ //Input handling
                System.out.println("Incorrect. Please enter a value between 2 and 16.");
                continue;
            }
            
            System.out.println("Now enter the desired origin number system (2-16) for the second number. Enter \"STOP\" at any time to terminate the program.");
            userInput = gioScanner.nextLine().toUpperCase();
           
            if(userInput.equals("STOP")){//Input handling
                break;
            }
            int originSystem2 = Integer.parseInt(userInput);
            if (originSystem2 < 2 || originSystem2 > 16){ //Input handling
                System.out.println("Incorrect. Please enter a value between 2 and 16.");
                continue;
            }
            
            System.out.println("Now enter the desired target number system (2-16) for the second number. Enter \"STOP\" at any time to terminate the program.");
            userInput = gioScanner.nextLine().toUpperCase();
           
            if(userInput.equals("STOP")){//Input handling
                break;
            }
            int targetSystem = Integer.parseInt(userInput);
            if (targetSystem < 2 || targetSystem > 16){ //Input handling
                System.out.println("Incorrect. Please enter a value between 2 and 16.");
                continue;
            }
            
            System.out.println("Enter the first number. Enter \"STOP\" at any time to terminate the program.");
            userInput = gioScanner.nextLine().toUpperCase();
           
            if(userInput.equals("STOP")){//Input handling
                break;
            }
            int firstNumber = Integer.parseInt(userInput, originSystem);
            
            System.out.println("Enter the second number. Enter \"STOP\" at any time to terminate the program.");
            userInput = gioScanner.nextLine().toUpperCase();
           
            if(userInput.equals("STOP")){//Input handling
                break;
            }
            int secondNumber = Integer.parseInt(userInput, originSystem2);
            
            int sum = firstNumber + secondNumber;
            int diff = firstNumber - secondNumber;
            int quotient = firstNumber / secondNumber;
            int remainder = firstNumber % secondNumber;
            int product = firstNumber * secondNumber;
            
            if (targetSystem == 2){
                System.out.println("Sum:\t\t" + Integer.toBinaryString(sum));
                System.out.println("Difference:\t" + Integer.toBinaryString(diff));
                System.out.println("Quotient:\t" + Integer.toBinaryString(quotient));
                System.out.println("Remainder:\t" + Integer.toBinaryString(remainder));
                System.out.println("Product:\t" + Integer.toBinaryString(product));
            } else{
                System.out.println("Sum:\t\t" + Integer.toString(sum, targetSystem));
                System.out.println("Difference:\t" + Integer.toString(diff, targetSystem));
                System.out.println("Quotient:\t" + Integer.toString(quotient, targetSystem));
                System.out.println("Remainder:\t" + Integer.toString(remainder, targetSystem));
                System.out.println("Product:\t" + Integer.toString(product, targetSystem));
            }
            
            
        }
    }
}
