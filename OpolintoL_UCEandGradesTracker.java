import java.util.Scanner;
/**
 * Opolinto, Leo A.
 * CC2-1B
 * University Course Enrollment and Grades Tracker
 */
public class OpolintoL_UCEandGradesTracker {
    public static void main (String[] args){
        Scanner gioScanner = new Scanner(System.in);
        String[] studentNames = {"Karl", "Nim'baas", "Jason", "Khaled", "Ch'r'ai Tska'an"};//declare an array containing the student names
        int[][] subjectGrades = new int[studentNames.length][3];//declare an array for the grades. we use studentNames.length here in case the user wants to enter more students, but the amount of subjects is always the same anyways
        double averageGrade;
        
        for (int i = 0; i < studentNames.length; i++){//iterate through the student list
            averageGrade = 0;
            System.out.println("You are now managing " + studentNames[i] + "'s grades. Enter them below.");
            for(int j = 0; j < subjectGrades[i].length; j++){//since the grade array has the same length as and its index corresponds to our name array, we can use i for the grade array as well
                System.out.print("Enter " + studentNames[i] + "'s grade for subject no." + (j + 1) + ": ");//prompts the user to enter the data for the student at i
                subjectGrades[i][j] = gioScanner.nextInt();
                averageGrade += subjectGrades[i][j];//appends the value just collected by the scanner to the average grade value.
            }
            System.out.print(studentNames[i] + "'s final average grade across " + subjectGrades[i].length + " subjects is ");
            System.out.printf("%.2f%n", (averageGrade/subjectGrades[i].length));//directly prints the average grade formatted to 2 decimal points.
        }
    }
}