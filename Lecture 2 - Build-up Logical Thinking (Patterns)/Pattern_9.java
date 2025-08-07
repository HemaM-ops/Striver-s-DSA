//M Hemasri - AIE22028
// 05.08.25 - Tuesday

/*Pattern 9
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

 */


//simply combine pattern 7 and pattern 8
public class Pattern_9 {

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

    public void printPattern8_1(int n){

        for(int i = n; i >= 1; i--){

            //for loop for spaces
            for(int j = 1; j<= (n-i); j++){
                System.out.print(" ");

            }

            //for loop for stars
            for(int k=1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        Pattern_9 obj= new Pattern_9();
        obj.printPattern7(5); // Print the upper part
        obj.printPattern8_1(5); // Print the lower part
    }

    
}
