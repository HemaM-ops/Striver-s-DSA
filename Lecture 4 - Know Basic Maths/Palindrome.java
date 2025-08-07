// M Hemasri - AIE22028
// 07.08.25 - Thursday

// Check if a number is a palindrome
//GFG Practice - https://www.geeksforgeeks.org/problems/palindrome0746/1

//logic
// A number is a palindrome if number == reverse of number.
// return true if palindrome, else return false

import java.util.Scanner;
public class Palindrome {

    public boolean isPalindrome(int n){

        int revNum =0;
        int original = n; // store n because we will modify n in while loop

        while(n>0){
            int digit = n%10;
            n = n/10;
            revNum = (revNum*10) + digit;
        }

        return (revNum == original);

    }

    public static void main(String[] args){
        Palindrome obj = new Palindrome();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for Palindrome check: ");
        int n = sc.nextInt();

        System.out.println(obj.isPalindrome(n));
        sc.close();
    }
    
}
