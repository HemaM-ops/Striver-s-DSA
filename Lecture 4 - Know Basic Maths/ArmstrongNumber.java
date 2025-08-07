// M Hemasri - AIE22028
// 07.08.25 - Thursday

// Check if a number is an Armstrong number
// An armstrong number is a number that is equal to the 
//sum of its own digits each raised to the power of the number of digits.

//logic
// 1) Find the number of digits in the number.
// 2) For each digit, raise it to the power of the bo.of digits and sum them up.
// Geeks for Geeks Practice: https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
import java.util.Scanner;
public class ArmstrongNumber {

    public boolean isArmstrong(int n){

        int original=n;
        int calc = n;
        int count = 0;
        int numSum = 0;

        //Count the no.of digits
        while( n > 0){
            n = n/10;
            count++;
        }

        //calculate the sum of digits raised to the power of count
        while( calc > 0){
            int digit = calc % 10;
            calc = calc/10;
            numSum += (int) Math.pow(digit,count);
        }

        return numSum == original;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        ArmstrongNumber obj = new ArmstrongNumber();

        if(obj.isArmstrong(n))
            System.out.println("The given number is an Armstrong number");
        else
        System.out.println("The given number is not an Armstrong number");

        sc.close();
    }
    
}
