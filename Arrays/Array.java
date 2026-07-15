package Arrays;


//LARGEST IN THE ARRAY
// public class Array{
//     public static void main(String[] args) {
//         int numbers[] = {1,3,4,5,6,6,74,3,3,2,2};
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i] > largest) largest = numbers[i];
//         }
//         System.out.println(largest);
//     }
// }


// BINARY SEARCH
// public class Array{
//     public static void main(String[] args) {
//         int number[] = {2,4,5,7,8,9,11,23,45};
//         int num = 7;
//         int left = 0;
//         int right = number.length-1;
        
//         while(left<=right){
//         int mid = (left+right)/2;
//         if(number[mid] == num) {
//             System.out.println(mid);
//         }
//         if(number[mid] > num){
//             right = mid-1;
//         }
//         else left = mid+1;
//     }
// }
// }


//REVERSE A ARRAY //ARRAY PAIR //SUBARRAY
// public class Array{
//     public static void reverseArr(int arr[]){
//         int left = 0;
//         int right = arr.length-1;

//         while(left < right){
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void arrayPair(int arr[]){
//         for (int i = 0; i < arr.length; i++) {
//             for(int j=i+1; j< arr.length; j++){
//                 System.out.print("("+arr[i]+","+arr[j]+")");
//             }
//             System.out.println();
//         }
//     }

//     public static void subarray(int arr[]){
//         int sum = 0;
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 for(int k=i; k<=j; k++){
//                     //System.out.print(arr[k]+" ");
//                     sum = sum+arr[k];
//                 }
//                 System.out.print("sum: "+sum);
//                 if(sum > max) max = sum;
//                 if(sum < min) min = sum;
//                 System.out.println();
//                 sum = 0;
//             }
//             System.out.println();
//         }
//         System.out.println("maximun sum ="+max);        
//         System.out.println("minimun sum ="+min);

//     }
//     public static void main(String[] args) {
//         int array[] = {2,4,6,8,10};
//         //reverseArr(array);
//         //arrayPair(array);
//         subarray(array);
//     }
// }

//distinct false
public class Array{
    public static boolean distarr(int arr[]){
        boolean dist = false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]) dist = true;
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr1[] = {1,2,3,4,4};

        System.out.println(distarr(arr));
        System.out.println(distarr(arr1));
    }
}