//M Hemasri - AIE22028
// 07.08.25 - Thursday

// Print the digits of a number
import java.util.Scanner;

public class Digits {

    public void printDigits(int n) {
        if (n < 0) {
            System.out.println("Negative numbers are not allowed.");
        }
        else {
            while(n > 0) {
            int digit = n % 10;
            System.out.print("" + digit + " ");
            n /= 10;
            }

        }
    }

    public static void main(String[] var0) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int digit = sc.nextInt();
        Digits obj = new Digits();
        obj.printDigits(digit);

        sc.close();
    }
}
