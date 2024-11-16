//calvulate simple interest
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter profit: " );
        float profit = scanner.nextFloat();
        
        System.out.println("Enter time: ");
        float time = scanner.nextFloat();
        
        System.out.println("Enter rarte of interest: ");
        float rateOfInterest = scanner.nextFloat();

        float simpleInterest;
        simpleInterest = (profit*time*rateOfInterest)/100;
        
        System.out.println("Simple interest: "+simpleInterest);
    }
}
