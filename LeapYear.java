import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        int a = year % 4;
        int b = year % 100;
        int c = year % 400;

        if(a==0){
            if(b != 0 || c == 0){
                System.out.println("Leap year: "+year);
            }
            else System.out.println("Not a Leap Year: "+year);
        }
        else System.out.println("Not a Leap year: "+year);
    }
}
