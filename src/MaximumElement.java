package src;
/***Find Maximum Element:**
    - **Task:** Given an integer array, write a program to find and print the maximum element in the array.
    - **Sample Input:** `[5, 12, 3, 19, 7, 26, 14]`
    - **Sample Output:** `Maximum Element = 26` 
 * 
*/
public class MaximumElement {
    public static void main(String[] args){
        int[] arr = {5, 12, 3, 19, 7, 26, 14};
        int max = arr[0];
        for ( int i = 0; i < arr.length; i++){
            if (arr[i] > max)
            max = arr[i];
        }
            System.out.println("The maximum element of array is: " + max);
        
    }
}
