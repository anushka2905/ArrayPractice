/***Reverse an Array:**
    - **Task:** Create a program to reverse the elements in a character array and print the reversed array.
    - **Sample Input:** `['a', 'b', 'c', 'd', 'e']`
    - **Sample Output:** `['e', 'd', 'c', 'b', 'a']` */
public class ReversalElement {
    public static void main(String[] args){
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        char reverse = arr[0];
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed array: ");

        }


    }


