// M Hemasri - AIE222028
// 07.08.25 - Thursday

//Know Basic Maths - Extract the digits of a number
import java.util.Scanner;
public class Digits{

    public void printDigits(int n){
        if(n<0){
            System.out.println("Negative numbers are not allowed.");
            return;
        }
        else{
            while(n > 0){
                int digit=n%10;
                System.out.print(digit + " ");
                n=n/10;
            }
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        Digits obj = new Digits();
        obj.printDigits(n);

    }
}