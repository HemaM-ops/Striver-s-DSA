// M Hemasri - AIE22028
// 07.08.25 - Thursday

//Count the number of digits in a number
// GFG Practice link - https://www.geeksforgeeks.org/problems/count-digits-1606889545/1

import java.util.Scanner;
class CountDigits{
    public int countDigits(int n) {
        // code here
        int count=0;
        while(n>0){
            n=n/10;
            count += 1;
            
        }
        
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CountDigits obj  = new CountDigits();

        int n = sc.nextInt();
        int result = obj.countDigits(n);
        System.out.println(result);
    }
}
