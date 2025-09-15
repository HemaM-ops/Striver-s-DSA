// M Hemasri - AIE22028
// 15.09.25 - Monday

// print the sum of first n numbers - using parameterised recursion
//parametrised - when we pass parameters to the function

public class Sum{
    public static void sum(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
    }
        sum(i-1,sum+i);
    }

    public static void main(String args[]){
        sum(5,0);
    }
}