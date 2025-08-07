// M Hemasri - AIE22028
// 07.08.25 - Thursday

//Count the number of digits in a number
// GFG Practice link - https://www.geeksforgeeks.org/problems/count-digits-1606889545/1


import java.util.Scanner;




public class CountDigitsEasy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Negative numbers are not allowed.");
        } else {
            int count =(int) (Math.log(n) / Math.log(10) + 1);
            System.out.println("Number of digits: " + count);
        }
        
        sc.close();
    }
}