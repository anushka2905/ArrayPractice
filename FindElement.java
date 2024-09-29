
public class FindElement {
    public static void main(String[] args){
        int[] arr = {10,38,93,22,87,66};
        int searchElement = arr[0];
        searchElement = 93;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchElement){
                if (i == -1) {
            System.out.println("Element " + searchElement + " not found in the array.");
        } else {
                System.out.println("Element " + searchElement + " found at index: " + i);
            }
        }
        }
    }
}
