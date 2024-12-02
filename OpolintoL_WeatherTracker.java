package Activities;
import java.util.Arrays;
/**
 * Opolinto, Leo A.
 * CC2-1B
 * Classroom Attendance System
 */
public class OpolintoL_WeatherTracker {
    public static void main (String[] args){
        int[][] weatherMeasurements = { {33,24,31,30,26,24,28}, //instantiates the temperatures per city over the course of 7 days
            {29,24,31,22,30,25,24},
            {20,24,30,31,38,22,26} 
        };
        
        for(int i = 0; i < weatherMeasurements.length; i++){ //sorts the array from lowest to highest
            Arrays.sort(weatherMeasurements[i]);
        }
        
        for(int i = 0; i < weatherMeasurements.length; i++){ //iterates over the cities
            double average = 0; //instantiates the average, resets after being displayed
            int highest = weatherMeasurements[i][weatherMeasurements[i].length - 1]; //gets the highest temperature from the array of sort, resets after being displayed
            for(int j = 0; j < weatherMeasurements[i].length; j++){
                average += weatherMeasurements[i][j];
            }
            average = average/weatherMeasurements[i].length; //calculates the average based on the sum of the temperatures and the length of the array, displays the city, average temps, sorted temps, and the highest temp
            System.out.println("City " + (i + 1) + ":");
            System.out.println("Sorted Temperatures: " + Arrays.toString(weatherMeasurements[i]));
            System.out.printf("Average Temperature: %.2f%n", average);
            System.out.println("Highest Temperature: " + highest);
        }
    }
}
