/*
    **Integer Array Initialization:**
    - **Task:** Create an integer array of size 5 and initialize it with the values 10, 20, 30, 40, and 50.
    - **Sample Input:** None (initialize directly).
    - **Sample Output:** `[10, 20, 30, 40, 50]` 
*/
    class IntegerArray{
        public static void main(String[] args){
            int[] arr = { 10, 20, 30, 40, 50 };

            System.out.print("Elements of given array are: ");
    
            // Looping through array by incrementing value of i
            //'i' is an index of array 'arr'
            for (int i = 0; i < arr.length; i++) {
    
                // Print array element present at index i
                System.out.print(arr[i] + " ");
            }
        }
    }