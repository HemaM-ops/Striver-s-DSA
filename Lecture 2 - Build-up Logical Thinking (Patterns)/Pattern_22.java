// M Hemasri - AIE22028
// 06.08.25 - Wednesday
/* Pattern 22
 * 4444444
 * 4333334
 * 4322234
 * 4321234
 * 4322234
 * 4333334
 * 4444444
 */


public class Pattern_22 {

    public void printPattern(int n){

        //outer loop run 2n-1 times
        for(int i=1; i<= 2*n-1; i++){

            //inner loop runs 2n-1 times
            for(int j=1; j<=2*n-1; j++){
                System.out.print(n+1-Math.min(Math.min(i,(2*n-i+1)), Math.min(j,2*n-j+1)));
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Pattern_22 obj = new Pattern_22();
        obj.printPattern(4);
    }
    
}
