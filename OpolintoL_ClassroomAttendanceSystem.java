package Activities;
import java.util.Scanner;
/**
 * Opolinto, Leo A.
 * CC2-1B
 * Classroom Attendance System
 */
public class OpolintoL_ClassroomAttendanceSystem {
    public static void main(String args[]){
        Scanner gioScanner = new Scanner(System.in);//scanner declaration and variable declaration
        int userInput, presenceCounter;
        String studentPresence;
        
        System.out.print("Please enter the total number of expected students. ");//prompts for user input, gathers total number of students and initializes the counter for present students
        userInput = gioScanner.nextInt();
        presenceCounter = 0;
        for(int i = 1; i < (userInput + 1); i++){//for every number less than or equal to userInput, it asks the user if the corresponding student is present or not
            System.out.print("Is student " + i + " present? (Y/N)");
            studentPresence = gioScanner.next().toUpperCase();
            if(studentPresence.equals("Y")){
                presenceCounter++;//every time a student is marked as present, the presenceCounter increments by 1
            }
        }
        
        System.out.println("Total present: " + presenceCounter);//outputs the results
        System.out.println("Total absent: " + (userInput - presenceCounter));//gets the absentees by subtracting the present students from the total number of students
    }
}
