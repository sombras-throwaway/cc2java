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
        int gradeSum, gradeAverage, gradePassCounter;
        int[] gradeArray = new int[gradeLength];
        gradeSum = 0; //initializes the sum for the purposes of finding the average
        gradePassCounter = 0
        //for loop to gather the grades and place them in the appropriate index
        for(int i = 0; i < 10; i++){
            System.out.print("Enter the grade: ");
            gradeArray[i] = gioScanner.nextInt();
            gradeSum = gradeSum + gradeArray[i];
        }
        //calculates the average and initializes the variables for the lowest and highest grades
        gradeAverage = gradeSum/gradeArray.length;
        //compares a variable accross all elements in the array, if the initial lowest grade is lower than the given grade, then it keeps the position. otherwise the lower number is now the lowest.
        for(int i = 0; i < 10; i++){
            if(gradeArray[i] > gradeAverage){
                gradePassCounter++;
            }
        }
        //outputs the findings
        System.out.println("Average of the grades: " + gradeAverage);
        System.out.println("Students who scored higher than average: " + gradePassCounter++);
    }
    
}
