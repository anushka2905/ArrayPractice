
/*
 * 15. **Sum of Odd Elements:**
    - **Task:** Write a Java program to calculate the sum of all odd numbers in an integer array.
    - **Sample Input:** `[1, 2, 3, 4, 5, 6, 7, 8]`
    - **Sample Output:** `Sum of odd elements = 16`
 */
public class SumOfOddNumbers {
    public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    int sum = 0 ;
       
    //calculate sum of even numbers
     for(int num : arr){
     if(num % 2 != 0){
         sum += num;
         }
     }
     //print sum of even numbers
     System.out.println("Sum of odd numbers: " + sum);
    }
}
