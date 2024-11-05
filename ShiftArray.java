

import java.util.Arrays;

class ShiftArray {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        if (arr.length == 0) return;

        // Store the first element
        int first = arr[0];
        
        // Shift all elements to the left
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        
        // Put the first element at the last position
        arr[arr.length - 1] = first;
        System.out.println("new array: " + Arrays.toString(arr));
    }


}
