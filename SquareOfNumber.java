
import java.util.Scanner;

//calculate suare of a number
public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = scanner.nextInt();
        
        int square;
        square = a*a;
        System.out.println("Square of the number: " + square);
    }
}
