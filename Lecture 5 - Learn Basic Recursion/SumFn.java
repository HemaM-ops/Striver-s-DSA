// M Hemasri - AIE22028
// 15.09.25 - Monday

//print sum of n numbers - functional Recursion

//Functional Recursion - when a function calls itself to solve a smaller instance of the same problem, no parameters are passed

public class SumFn{

    public static int sumfn(int n){
        if(n==0) return 0;
        return n + sumfn(n-1);
    }

    public static void main(String[] args){
        System.out.println(sumfn(5));
    }
}