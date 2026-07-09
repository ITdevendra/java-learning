
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number to print its table: ");
//         int n = sc.nextInt();

//         for(int i = 1; i<=10; i++){
//             System.out.println(n+" * "+i+" = "+ n*i);
//         }
//     }
// }



// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int even = 0;
//         int odd = 0;
//         int choice;
//         do{
//             System.out.print("Enter a number: ");
//             int n = sc.nextInt();
//             if(n%2 == 0)even = even + n;
//             else odd = odd + n;
//             System.out.print("Enter 1 to continue and 0 to exit: ");
//             choice = sc.nextInt();
        
//         }while(choice == 1);

//         System.out.println("Sum of even: "+even);
//         System.out.println("Sum of odd: "+odd);
//     }
// }

// PATTERN
// public class JavaBasics{
//     public static void main(String[] args) { 
//         int n = 4;
//         char ch = 'A';
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }


// //PATTERN HOLLOW RECTANGLE
// public class JavaBasics{
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i= 1; i<=n; i++){

//         }
//     }
// }


// //PATTERN INVERTED AND ROTATED HALF PYRAMID
// public class JavaBasics{
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i= 1; i<=n; i++){
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// //PATTERN INVERTED HALF PYRAMID
// public class JavaBasics{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j <= n-i+1; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


//PATTERN FLOYD'S TRIANGLE
public class JavaBasics{
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}