// M Hemasri - AIE22028
// 05.08.25 - Tuesday

/* Pattern 19
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 */


public class Pattern_19 {

    public void printPattern(int n){


        //code for first half of the pattern vertically

        for(int i=1; i<=n; i++){

            //loop for stars
            for(int j=1; j<= (n-i+1); j++){
                System.out.print("*");
            }

            //loop for spaces
            for(int k=1; k<= 2*(i-1); k++){
                System.out.print(" ");
            }

            //loop for stars
            //loop for stars
            for(int j=1; j<= (n-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //code for second half of the pattern

        for(int i=1; i<=n ; i++){

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            for(int k=1; k<= 2*(n-i);k++){
                System.out.print(" ");
            }

            //stars
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){

        Pattern_19 obj = new Pattern_19();
        obj.printPattern(5);

        

        
    }
    
}
