
import java.util.*;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if (num <= 1) {
                System.out.println(num + " is not prime."); 
            }else if (num == 2) {
                System.out.println(num + " is prime."); 
            }else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println(num + " is Prime."); 
                }else {
                    System.out.println(num + " is not prime.");
                }
            }
        }
    }
}
