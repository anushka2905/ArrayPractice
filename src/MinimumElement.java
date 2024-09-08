package src;
/*
 * **Find Minimum Element:**
    - **Task:** Write a Java program to find the minimum value in a double array.
    - **Sample Input:** `[2.5, 3.8, 1.9, 5.6, 4.3]`
    - **Sample Output:** `Minimum Element = 1.9`
 */
public class MinimumElement {
    public static void main(String[] args){
        double[] arr = {2.5, 3.8, 1.9, 5.6, 4.3};
        double min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min)
            min = arr[i];
        }
        System.out.println("the minimum elemnt is: " + min);
    }
}
