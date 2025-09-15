// M Hemasri - AIE22028
// 15.09.25 - Monday

//print numbers from 1 to n using Backtracking

public class PrintNumsBT{

    public static void printNums(int i,int n){
        if(i<1) return;
        printNums(i-1,n);
        System.out.println(i);
    }

    public static void main(String[] args){
        printNums(5,1);
    }
}