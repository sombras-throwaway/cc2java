package Activities;
import java.util.Scanner;
/**
 *
 * @author ch'r'ai nik'ga
 */
public class OpolintoL_RadixConverter {
        public static void main(String args[]){
            //Declare and initialize variables and create scanner
        Scanner userInput = new Scanner(System.in);
        String inputString = "";
       
        while (1 == 1){
            //Ask user for origin number system
            System.out.println("Please enter the desired origin number system (2-16). Enter \"STOP\" at any time to terminate the program.");
            inputString = userInput.nextLine().toUpperCase();
           
            if(inputString.equals("STOP")){//Input handling
                break;
            }
            int originSystem = Integer.parseInt(inputString);
            if (originSystem < 2 || originSystem > 16){ //Input handling
                System.out.println("Incorrect. Please enter a value between 2 and 16.");
                continue;
            }
           
            System.out.println("Please enter the desired number to convert. Enter \"STOP\" at any time to terminate the program.");
            inputString = userInput.nextLine().toUpperCase();
            if(inputString.equals("STOP")){
                break;
            }
           
            int hiddenNumber = Integer.parseInt(inputString, originSystem);//Creates a hidden number set to base originSystem as the true number
           
           
            System.out.println("Origin: " + originSystem);
            System.out.println("Desired Number: " + userInput);
            System.out.println("Desired Number in Base 10: " + Integer.toString(hiddenNumber, 10));//Outputs the true number to base 10
           
           
            System.out.println("Conversions: ");
           
            for (int targetBase = 2; targetBase <= 16; targetBase++){//Iterates through number systems 2-16 and converts the true number accordingly
                String convertedNumber = Integer.toString(hiddenNumber, targetBase);
                System.out.println(inputString + " in base " + targetBase + " is " + convertedNumber);
            }
        }
   }
} 
