// M Hemasri - AIE22028
// 15.09.25 - Monday

// print numbers from n to 1 using recursions but by backtracking

public class PrintRevNumsBT{

    public static void printRevNums(int i,int n){
        if(i>n) return;
        printRevNums(i+1,n);
        System.out.println(i);
    }

    public static void main(String args[]){
        printRevNums(1,5);
    }
}