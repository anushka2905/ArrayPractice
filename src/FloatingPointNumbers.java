package src;
/*
 * 13. **Array of Floating-point Numbers:**
    - **Task:** Create a float array of size 4, initialize it with values, and write a program to print the array.
    - **Sample Input:** `[1.1f, 2.2f, 3.3f, 4.4f]`
    - **Sample Output:** `[1.1, 2.2, 3.3, 4.4]`
 */

import java.util.Arrays;

public class FloatingPointNumbers {
    public static void main(String[] args){
        float[] arr = {1.1f, 2.2f, 3.3f, 4.4f};
        
        // Print the array
        System.out.println("Float array: " + Arrays.toString(arr));
    }   
}
