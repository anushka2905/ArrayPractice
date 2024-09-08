package src;
/***Count Occurrences of an Element:**
    - **Task:** Write a program to count the number of times a specific character appears in a character array.
    - **Sample Input:** `Array: ['a', 'b', 'a', 'c', 'a', 'd']`, `Character to count: 'a'`
    - **Sample Output:** `'a' occurs 3 times`
 *  */
class CountOccurrence{
    public static void main(String[] args){
       char[] arr = {'a', 'b', 'a', 'c', 'a', 'd'};
       int count = 0;
       for (int i = 0 ;i < arr.length; i++){
        char temp = arr[i];
        if(temp == 'a'){
            temp = (char)(temp);
        }
        if(temp == 'a'){
            count++;
        }
    }
       System.out.println("Number of 'a' occrring in the array: " + count );
    }
}