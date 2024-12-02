import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigDecimal;
/**
 * Opolinto, Leo A.
 * 11/20/2024
 * Retail Store Inventory Management
 * CC2-1B
 */
public class OpolintoL_RetailInventoryManagement {
    public static void main (String[] args){
        Scanner gioScanner = new Scanner(System.in);
        /*Version 1 with predefined array
        int[] stockArray = {5,12,6,15,10,7,11,5,20,16};//initializes predefined values for the stock, where each index of the array is its own product
        int[] priceArray = {50,105,20,44,90,110,45,250,45,25};//initializes predefined values for the price per piece, where each index of the array is its own product
        
        for (int i = 0; i < stockArray.length; i++){
            System.out.println("The total price of item no." + (i + 1) + " is " + (stockArray[i]*priceArray[i]));//outputs the total price of the product, where price per piece for each product is multiplied to the stock
        }*/
        
        /*Version 2 with user Input*/
        int[] stockArray2 = new int[10];//creates an array of size 10 for the stock of each product
        double[] priceArray2 = new double[10];//creates an array of size 10 for the price per piece of each product
        double universalPrice = 0;
        DecimalFormat gioFormat = new DecimalFormat("$#,##0.00");//specifies US currency localization for formatting
        String rendPrice = "";
        for (int i = 0; i < stockArray2.length; i++){//traverses each value in the array and asks the user for an input for each product
            System.out.print("Enter the stock for item no." + (i + 1) + " ");
            stockArray2[i] = gioScanner.nextInt();
        }
        for (int i = 0; i < priceArray2.length; i++){
            System.out.print("Enter the price per piece of item no." + (i + 1) + " ");
            priceArray2[i] = gioScanner.nextInt();
            priceArray2[i] = priceArray2[i] * stockArray2[i];//since the user is expected to enter the price per piece, this replaces the value they entered in the index with the product of the price per piece and the product quantity
            universalPrice += priceArray2[i];
        }
        for (int i = 0; i < priceArray2.length; i++){
            BigDecimal printPrice = new BigDecimal(priceArray2[i]);//first creates a new BigDecimal object to bypass formatting restrictions
            rendPrice = gioFormat.format(printPrice);//passes BigDecimal object printPrice through gioFormat, which formats the object according to the parameters set prior
            
            System.out.println("The total price of item no." + (i + 1) + " is " + rendPrice);//traverses through each index and then prints each value of the array containing the prices
        }
        BigDecimal printPrice = new BigDecimal(universalPrice);//same as when printing the smaller values prior, creates a BigDecimal object from the tally of total prices
        rendPrice = gioFormat.format(printPrice);//formats object by passing it through gioFormat
        System.out.println("The total value of all items in the stock is: " + rendPrice);
    }
}
