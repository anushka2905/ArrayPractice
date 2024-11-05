
/*
 * **Copying Arrays:**
    - **Task:** Create two integer arrays of size 5. Write a program to copy the elements of the first array into the second array.
    - **Sample Input:** `First Array: [1, 2, 3, 4, 5]`
    - **Sample Output:** `Second Array: [1, 2, 3, 4, 5]`
 */
public class CopyingArray {
    public static void main(String[] args){
        int arr[] = {1 , 2 , 3 , 4 , 5};
        int brr[] =  new int[arr.length];
        brr = arr;

        System.out.println("Contents of arr[]: ");
        for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + "");
        }
    
        System.out.println("\nContents of brr[]: ");
        for(int i = 0 ; i < brr.length; i++){
            System.out.print(brr[i] + "");
        }

    }   
}
