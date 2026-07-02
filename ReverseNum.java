import java.util.Scanner;
public class ReverseNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt();

        int reverse = 0;
        while(num>0){
            int num1 = num % 10;
            reverse = reverse*10 + num1;
            num = num/10;
        }
        System.out.println("no: "+reverse);
    }
}