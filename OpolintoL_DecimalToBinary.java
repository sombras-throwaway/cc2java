package Activities;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author leozy
 */
public class OpolintoL_DecimalToBinary {
    public static void main(String[] args){
        //declare variables, starting arrays, and create scanner.
        Scanner myInput = new Scanner(System.in);
        System.out.println("Input a Decimal please. Enter \"STOP\" to terminate the program. ");
        String UserInput = myInput.nextLine();
        int[] Remainders = new int[64];
        int decimal = 0;
        int index = 0;
        //main loop
        while(!UserInput.equals("STOP")){//checks if user inputted STOP.
            while(Integer.parseInt(UserInput) < 1){//checks if number is less than 1
                System.out.println("Invalid value. Please enter a non-negative, non-zero number.");
                UserInput = myInput.nextLine();
            }
            //fills an array with the remainders of a division while halfing the decimal.
            decimal = Integer.parseInt(UserInput);
            index = 0;
            while (decimal != 0){
                Remainders[index] = decimal % 2;
                decimal = decimal/2;
                index ++;
            }
            //reverses the binary for it to be in the correct order
            int[] binaryArray = new int[index];
            for (int i = 0; i < index; i++) {
                binaryArray[i] = Remainders[index - i - 1];
            }
            //outputs the resulting binary conversion. includes manually formatting the array into a proper string.
            System.out.print("The binary form of your chosen decimal is: ");
            System.out.print(Arrays.toString(binaryArray).replace(",", "").replace("[", "").replace("]", "").trim());
            System.out.println("\nInput a new Decimal please. Enter \"STOP\" to terminate the program.");
            UserInput = myInput.nextLine();
        }
        System.out.println("Program terminated.");
    }
}
