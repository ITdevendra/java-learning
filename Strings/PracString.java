package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class PracString {
    public static void vowelcount(String user){
        int count = 0;
        for(int i=0; i<user.length(); i++){
            if(user.charAt(i)=='a' || user.charAt(i)=='e' || user.charAt(i)=='i' || user.charAt(i)=='o' || user.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("count of vowel is: "+count);
    }

    public static void anagrams(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray, str2CharArray);
            if(result){
                System.out.println("Strings are anagrams");
            }
            else System.out.println("Strins are not anagrams");
        }
        else System.out.println("Strings are not anagrams");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter a string: ");
        // String user = sc.next();
        // vowelcount(user);

        String str1 = "race";
        String str2 = "care";
        anagrams(str1, str2);
        
    }
}
