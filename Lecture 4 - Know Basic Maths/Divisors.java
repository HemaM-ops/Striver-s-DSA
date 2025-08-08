// M Hemasri - AIE22028
// 08.08.25 - Friday

// Print all the divisors of a number in ascending order

// simple logic
// iterate from i = 1 to sqrt(n)
// if n% i == 0 then i is a divisor, and n/i is also a divisor
// Be careful about the duplicates, where n/i != i
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Divisors{

    public void printDivisors(int n){
        List<Integer> divisors = new ArrayList<>();
        //loop from 1 to sqrt of n
        for(int i=1; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                divisors.add(i);
                if(n/i != i){
                    // to avoid duplicates
                    divisors.add(n/i);
                }
            }

        }

        //sort the list in ascending order
        Collections.sort(divisors);
        for(int i:divisors){
            System.out.print(i+" ");
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Divisors obj = new Divisors();
        obj.printDivisors(n);
        sc.close();
    }


}