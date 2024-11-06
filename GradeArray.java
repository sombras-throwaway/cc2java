import java.util.Scanner;

/**
 *
 * Leo A. Opolinto
 * CC2-1B
 * Input Grades Into an Array
 */

public class GradeArray {
    public static void main(String[] args){
        //variable, scanner, and array declaration
        Scanner gioScanner = new Scanner(System.in);
        int gradeLength, gradeSum, gradeAverage, gradeLowest, gradeHighest;
        //asks the user for an array length
        System.out.print("How many grades are you entering? ");
        gradeLength = gioScanner.nextInt();
        int[] gradeArray = new int[gradeLength];
        gradeSum = 0; //initializes the sum for the purposes of finding the average
        //for loop to gather the grades and place them in the appropriate index
        for(int i = 0; i < gradeLength; i++){
            System.out.print("Enter the grade: ");
            gradeArray[i] = gioScanner.nextInt();
            gradeSum = gradeSum + gradeArray[i];
        }
        //calculates the average and initializes the variables for the lowest and highest grades
        gradeAverage = gradeSum/gradeArray.length;
        gradeHighest = gradeArray[0];
        gradeLowest = gradeArray[0];
        //compares a variable accross all elements in the array, if the initial lowest grade is lower than the given grade, then it keeps the position. otherwise the lower number is now the lowest.
        for(int i = 0; i < gradeLength; i++){
            if(gradeLowest > gradeArray[i]){
                gradeLowest = gradeArray[i];
            }
        }
        //same logic for finding the lowest grade, because the highest grade will never be lower than any other element.
        for(int i = 0; i < gradeLength; i++){
            if(gradeHighest < gradeArray[i]){
                gradeHighest = gradeArray[i];
            }
        }
        //outputs the findings
        System.out.println("Average of the grades: " + gradeAverage);
        System.out.println("Lowest of the grades: " + gradeLowest);
        System.out.println("Highest of the grades: " + gradeHighest);
    }
    
}
