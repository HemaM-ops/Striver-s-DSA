// M Hemasri - AIE22028
// 06.08.25 - Wednesday

/*Pattern 20
 *    *        *
 *    **      **
 *    ***    ***
 *    ****  ****
 *    **********
 *    ****  ****
 *    ***    ***
 *    **      **
 *    *        *
 * 
 */

public class Pattern_20{

    public void printPattern(int n){


        int stars; //for no.of stars in each row
        int spaces;//for no.of spaces in each row
        //if n is the input
        //outer loop runs 2*n-1 times
        for(int i=1; i<= 2*n-1; i++){

            if(i>n){
                stars = 2*n-i;
                spaces =2*(i-n);
            }
            else{
                stars=i;
                spaces=2*(n-i);
            }

            //print stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }

            //print spaces
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //print stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }



    public static void main(String args[]){

        Pattern_20 obj = new Pattern_20();
        obj.printPattern(5);
    }
}