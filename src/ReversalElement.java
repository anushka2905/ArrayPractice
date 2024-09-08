package src;
import java.util.Arrays;

/***Reverse an Array:**
    - **Task:** Create a program to reverse the elements in a character array and print the reversed array.
    - **Sample Input:** `['a', 'b', 'c', 'd', 'e']`
    - **Sample Output:** `['e', 'd', 'c', 'b', 'a']` */
public class ReversalElement {
    public static void main(String[] args){
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        int left = 0;
        int right = arr.length - 1;
      
        // Swap elements from start to end until the middle of the array is reached
        while (left < right) {
            // Swap the characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move the pointers towards the middle
            left++;
            right--;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));

        }
    }


