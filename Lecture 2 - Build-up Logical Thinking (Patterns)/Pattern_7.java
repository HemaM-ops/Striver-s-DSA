// M Hemasri - AIE22028
// 03.08.25 - Sunday

/* Pattern 7
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */

public class Pattern_7 {

    public void printPattern7(int n){

        //outer loop for number of rows
        for(int i=1; i<=n; i++){

            //2 inner loops required - 1 for spaces and 1 for stars
            //first inner loop for spaces

            //Here no.of spaces = n - i
            for(int j=1; j <= (n-i); j++){
                System.out.print(" ");
            }

            //second loop for stars
            //Here no.of stars in each row = 2*i - 1
            for(int k=1; k<= (2*i-1); k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]){
        Pattern_7 obj=new Pattern_7();
        obj.printPattern7(7);
    }
    
}
