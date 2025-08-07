// M Hemasri - AIE22028
// 07.08.25 - Thursday

// Reverse a number
//GFG practice - https://www.geeksforgeeks.org/problems/reverse-digit0316/1

//logic:
// since the extraction of the digits is in reverse order
// initialize a reverse number variable to 0
// everytime we extract a digit,multiply reverse number by 10 and add the digit to it

import java.util.Scanner;
public class ReverseNumber {

    public void reverseNumber(int n){

        int revNum=0;
        while(n>0){
            int digit = n%10;
            n = n/10;
            revNum = (revNum*10) + digit;
        }

        System.out.println("Reversed Number: "+ revNum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse:  ");
        int n = sc.nextInt();
        ReverseNumber obj = new ReverseNumber();
        obj.reverseNumber(n);

        sc.close();
        
    }
    
}
