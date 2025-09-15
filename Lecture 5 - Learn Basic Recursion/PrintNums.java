// M Hemasri - AIE22028
// 15.09.25 - Monday
// print numbers from n to 1 using recursion linearly
public class PrintNums{
    public static void printNums(int n){
        if(n==0) return;
        System.out.println(n);
        printNums(n-1);
    }
    public static void main(String[] args){
        printNums(5);
    }
}
