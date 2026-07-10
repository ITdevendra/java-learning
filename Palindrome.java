import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        isPalindrome(n);
        isPalindrome(121);
        isPalindrome(123);
        isPalindrome(1234321);

    }
    public static void isPalindrome(int n){
        int original = n;
        int num = 0;
        while(n>0){
           int mod = n%10;
           num = num*10 + mod;
           n = n/10;
        }
        if(original == num) System.out.println(original+" is a palindrome number.");
        else System.out.println(original+" is not a palindrome number.");
    }
}
