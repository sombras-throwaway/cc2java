package Activities;
import java.util.Scanner;

public class OpolintoL_GroceryStoreDiscount {
    public static void main(String[] args){
        Scanner gioScanner = new Scanner(System.in);//declares scanner
        System.out.print("Enter the total purchase amount: PHP");//prompts the user for an input
        int purchaseAmount; //variable declaration
        float discount, finalDue;
        
        purchaseAmount = gioScanner.nextInt();//collection of user input
        if(purchaseAmount < 1000){//starts evaluating if purchaseAmount avails a discount
            discount = 1f;//assigns a corresponding discount float to be multiplied to the purchaseAmount later
            System.out.println("You have availed no discount.");
        }
        else if (1000 <= purchaseAmount && purchaseAmount <= 5000){
            discount = .95f;
            System.out.println("Congratulations! You have availed a 5% discount!");
        }
        else if (5001 <= purchaseAmount && purchaseAmount <= 10000){
            discount = .90f;
            System.out.println("Congratulations! You have availed a 10% discount!");
        }
        else{
            discount = .85f;
            System.out.println("Congratulations! You have availed a 15% discount!");
        }
        finalDue = purchaseAmount * discount;//multiplies purchaseAmount to the discount obtained to get the finalDue amount
        System.out.print("Total amount due: ");//outputs the result
        System.out.printf("%.0f", finalDue);
        System.out.print("\n");
    }
}
