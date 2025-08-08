// M Hemasri - AIE22028
// 08.08.25 - Friday

// Check if the given number is prime

// Prime number - A number is said prime if it is greater than 1 and has exactly two divisors 1 and itself

public class Prime{

    public boolean isPrime(int n){

        if(n<= 1){
            //System.out.print(n);
            return false;
        }

        for(int i = 2; i*i <= n; i++){
            if(n%i==0) return false;
        }
        return true;

    }

    public static void main(String args[]){
        Prime obj = new Prime();
        int n = -10;
        System.out.println(n);
        System.out.println(obj.isPrime(n));
    }
}