// M Hemasri - AIE22028
// 15.09.25 - Monday

// Print numbers from n to 1 linearly using recursion

public class PrintRevNums{
    public static void printRevNums(int n){
        if(n==0) return;
        System.out.println(n);
        printRevNums(n-1);

    }
    public static void main(String args[]){
        printRevNums(5);
    }
}