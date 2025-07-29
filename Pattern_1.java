/* printing the below pattern
 * * * *
 *  * * *
 *  * * *
 *  * * *
 */

public class Pattern_1{
    public static void main(String args[]){

        // outer loop is responsible for rows
        for(int i=0 ; i < 4; i++){

        //inner loop is for columns
        for(int j =0; j < 4; j++){

            //printing the pattern
            System.out.print("* \t");
        }
        // print statement to start a new line after the inner loop ends
        System.out.println();

        }
    }
}