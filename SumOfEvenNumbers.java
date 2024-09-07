/*
 * **Sum of Even Elements:**
   - **Task:** Write a Java program to find the sum of all even numbers in an integer array.
   - **Sample Input:** `[1, 2, 3, 4, 5, 6, 7, 8]`
   - **Sample Output:** `Sum of even elements = 20`
 */
public class SumOfEvenNumbers {
    public static void main(String[] args){
        //input array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
       
       //calculate sum of even numbers
        for(int num : arr){
        if(num % 2 == 0){
            sum += num;
            }
        }
        //print sum of even numbers
        System.out.println("Sum of even numbers: " + sum);
    }

    
}
