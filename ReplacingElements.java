

import java.util.Arrays;

public class ReplacingElements {



    public static void main(String[] args) {
        // Original array
        int[] arr = {4, 5, 6, 4, 7};
        
        // Values to replace
        int oldValue = 4;
        int newValue = 9;
        
        // Print original array
        System.out.println("Original array: " + Arrays.toString(arr));
        
        // Replace elements in the array
        replaceElements(arr, oldValue, newValue);
        
        // Print modified array
        System.out.println("Modified array: " + Arrays.toString(arr));
    }
    
    public static void replaceElements(int[] arr, int oldValue, int newValue) {
        // Iterate through the array and replace the old value with the new value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue) {
                arr[i] = newValue;
            }
        }
    }
}


