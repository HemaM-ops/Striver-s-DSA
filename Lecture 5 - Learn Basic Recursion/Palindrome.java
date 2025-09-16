// M Hemasri - AIE22028
// 16.09.25 - Tuesday

import java.util.Scanner;
//Check if a string is a palindrome using recursion

public class Palindrome{

    public static boolean isPalindrome(int i){
        if(i>=s.length()/2) return true;

        if(s.charAt(i)!= s.charAt(s.length()-i-1)) return false;

        return isPalindrome(i+1);
    }

    static String s;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        s = sc.nextLine();
        System.out.println(isPalindrome(0)? "Palindrome" : "Not a Palindrome");
        sc.close();
    }

}
