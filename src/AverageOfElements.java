package src;
/*
 * **Average of Array Elements:**
    - **Task:** Create a float array of size 7. Write a program to calculate the average of the elements in the array.
    - **Sample Input:** `[1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f]`
    - **Sample Output:** `Average = 4.7857143`
 */
public class AverageOfElements {
    public static void main(String[] args){
        float[] array = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f};
        // Variable to store the sum of elements
        float sum = 0;
        
        // Loop through the array to calculate the sum of elements
        for (float num : array) {
            sum += num;
        }
        
        // Calculate the average by dividing the sum by the length of the array
        float average = sum / array.length;
        
        // Print the result
        System.out.println("The average of the array elements is: " + average);
    }

    }

