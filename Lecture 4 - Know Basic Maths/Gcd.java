// M Hemasri - AIE22028
// 08.08.25 - Friday

// Find the GCD of two numbers

// Use Euclidean Algorithm that states gcd(a,b) = gcd(max(a,b)-min(a,b),min(a,b))
// this can further be reduced as gcd(a,b) = gcd( max(a,b) mod min(a,b), min(a,b)) until one of them becomes zero
// If one of them is zero then the other number is the gcd(a,b)

public class Gcd{
    public int gcd(int a, int b){

        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args){
        Gcd obj = new Gcd();

        System.out.println(obj.gcd(5,15));
    }
}