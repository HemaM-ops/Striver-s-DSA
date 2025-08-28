// M Hemasri - AIE22028
// 28.08.25 - THURSDAY

//Given first term (a), common difference (d) and a integer n of the Arithmetic Progression series,
// the task is to find nth term of the series.

public class Nth_term_GP{
    public int nthTerm(int a, int r, int n){
        int ans = a *(int) Math.pow(r,n-1);
        return ans;
    }

    public static void main(String args[]){
        Nth_term_GP ob = new Nth_term_GP();

        int a = 2;
        int r = 5;
        int n = 10;

        System.out.println("The "+n+"th term of the GP series is: "+ob.nthTerm(a,r,n));


    }
}