



class SmallestNumberOfArray{
    public static void main(String[] args){
        int[] arr = {12, -5, 0, 8, 3};
        int smallestPositive = findSmallestPositive(arr);
        // Print the result
        if (smallestPositive == Integer.MAX_VALUE) {
            System.out.println("No positive numbers found in the array.");
        } else {
    
            System.out.println("Smallest positive number: " + smallestPositive);
        }
  

        
    }
    
    private static int findSmallestPositive(int[] arr) {

        int minPositive = Integer.MAX_VALUE;
        
        for (int num : arr) {
            // Check if the number is positive and smaller than the current minimum
            if (num > 0 && num < minPositive) {
                minPositive = num;
            }
        }
        return minPositive;
    }    

}