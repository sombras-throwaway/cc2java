import java.util.Scanner;
public class OpolintoL_GroceryStoreDiscount {
    public static void main(String[] args){
        Scanner gioScanner = new Scanner(System.in);
        System.out.print("Enter the total purchase amount: PHP");
        int purchaseAmount;
        float discount, finalDue;
        
        purchaseAmount = gioScanner.nextInt();
        if(purchaseAmount < 1000){
            discount = 1f;
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
        finalDue = purchaseAmount * discount;
        System.out.print("Total amount due: ");
        System.out.printf("%.0f", finalDue);
        System.out.print("\n");
    }
}
