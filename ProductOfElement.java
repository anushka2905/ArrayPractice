/*18. **Product of Array Elements:**
    - **Task:** Write a Java program to find the product of all elements in a double array.
    - **Sample Input:** `[1.5, 2.0, 3.5]`
    - **Sample Output:** `Product = 10.5` */
public class ProductOfElement {
    public static void main(String[] args){
        double[] arr = {1.5, 2.0, 3.5};
        double product = 1.0;
        for(int i = 0; i < arr.length; i++){
            product *= arr[i];
        }
        System.out.println("The product is: " + product);
    }
}
