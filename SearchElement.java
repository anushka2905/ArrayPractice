/*7. **Element Search in Array:**
    - **Task:** Write a Java program to search for a specific integer in an array and print its index if found.
    - **Sample Input:** `Array: [4, 8, 15, 16, 23, 42]`, `Search Element: 16`
    - **Sample Output:** `Element 16 found at index 3`
 */

import java.util.Arrays;

public class SearchElement {
   public static void main(String[] args){
        int[] arr = {4, 8, 15, 16, 23, 42};
        int searchElement = arr[0];
        searchElement = 16;
        for (int i = 0; i < arr.length; i++) {
         if (arr[i] == searchElement) {
         if (i == -1) {
            System.out.println("Element " + searchElement + " not found in the array.");
        } else {
            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("Element " + searchElement + " found at index: " + i);
        }         }
     }
        
   }  
}
