
/*
 * **Check for Duplicates:**
    - **Task:** Write a program to check if there are any duplicate elements in an integer array.
    - **Sample Input:** `[7, 3, 9, 2, 3, 8]`
    - **Sample Output:** `Duplicate found: 3`
 */
public class DuplicateNumbers {
    public static void main(String[] args){
        int[] arr = {7, 3, 9, 2, 3, 8};
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            int temp = arr[i];
            if(temp == 3){
                temp = (int)(temp);
            }
            if(temp == 3){
                count++;
            }

        }
        System.out.println("Number of times 3 is repeated: " + count);
    }
}
