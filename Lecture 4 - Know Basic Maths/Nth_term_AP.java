// M Hemasri - AIE22028
// 28.08.25 - THURSDAY

//Given first term (a), common difference (d) and a integer n of the Arithmetic Progression series,
// the task is to find nth term of the series.

public class Nth_term_AP{
    public int nthTerm(int a, int d, int n){
        int ans = a + (n-1) * d;
        return ans;
    }

    public static void main(String args[]){
        Nth_term_AP ob = new Nth_term_AP();

        int a = 2;
        int d = 5;
        int n = 10;

        System.out.println("The "+n+"th term of the AP series is: "+ob.nthTerm(a,d,n));


    }
}