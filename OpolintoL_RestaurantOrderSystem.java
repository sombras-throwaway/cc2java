package Activities;
import java.util.Scanner;
/**
 * Opolinto, Leo A.
 * CC2-1B
 * Restaurant Order System
 */

public class OpolintoL_RestaurantOrderSystem {
    public static void main(String args[]){
        Scanner gioScanner = new Scanner(System.in);//scanner declaration, variable declaration
        int userInput, itemQuantity;
        
        System.out.println("MENU");//displays the menu
        System.out.println("1. Burger\t- PHP 100");
        System.out.println("2. Fries\t- PHP 50");
        System.out.println("3. Soda\t\t- PHP 30");
        System.out.println("4. Ice Cream\t- PHP 45");
        System.out.println("5. Exit");
        
        System.out.print("What menu item would you like? ");//prompts the user for an input, then asks for the itemQuantity, then multiplies the quantity with the corresponding price of the user's order
        userInput = gioScanner.nextInt();
        switch(userInput){
            case 1:
                System.out.print("Please enter the quantity of burgers you want. ");
                itemQuantity = gioScanner.nextInt();
                System.out.println("The total amount due is: PHP" + (itemQuantity*100));//directly outputs the product of the quantity of items ordered and the price of each
                break;
            case 2:
                System.out.print("Please enter the quantity of fries you want. ");
                itemQuantity = gioScanner.nextInt();
                System.out.println("The total amount due is: PHP" + (itemQuantity*50));
                break;
            case 3:
                System.out.print("Please enter the quantity of soda you want. ");
                itemQuantity = gioScanner.nextInt();
                System.out.println("The total amount due is: PHP" + (itemQuantity*30));
                break;
            case 4:
                System.out.print("Please enter the quantity of ice cream you want. ");
                itemQuantity = gioScanner.nextInt();
                System.out.println("The total amount due is: PHP" + (itemQuantity*45));
                break;
            case 5:
                System.out.print("Exiting the program...");
                break;
            
        }
    }
}
