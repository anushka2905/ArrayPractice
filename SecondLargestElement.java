
/*
 * **Find Second Largest Element:**
    - **Task:** Write a program to find the second-largest element in an integer array.
    - **Sample Input:** `[15, 22, 8, 19, 31]`
    - **Sample Output:** `Second Largest Element = 22
 */
public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {15, 22, 8, 19, 31};
        for ( int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
            if (arr[i] > arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
                }
            }
        }
        System.out.println("The second largest element of array is: " + arr[arr.length-4]);
    }
}
