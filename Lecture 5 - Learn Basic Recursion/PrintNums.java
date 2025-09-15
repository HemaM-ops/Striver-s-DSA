// M Hemasri - AIE22028
// 15.09.25 - Monday
// print numbers from n to 1 using recursion linearly
public class PrintNums{
    public static void printNums(int i,int n){
        if(i>n) return;
        System.out.println(i);
        printNums(i+1,n);
    }
    public static void main(String[] args){
        printNums(1,5);
    }
}
