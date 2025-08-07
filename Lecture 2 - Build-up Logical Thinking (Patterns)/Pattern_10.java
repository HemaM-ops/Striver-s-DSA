//M Hemasri - AIE22028
// 05.08.25 - Tuesday

/*Pattern 10

*
**
***
****
*****
****
***
**
*
 */
public class Pattern_10 {

    public void printPattern(int n){
        // outerloop should run (2n-1) times
        for(int i=1; i<=2*n-1; i++){
            // inner loop has two parts.
            //if i<=5 no.of stars =i, else no.ofstars = (n-i)

            int stars=i;
            if(i>n){
                stars = (2*n-i);
            }

            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String args[]){

        Pattern_10 obj = new Pattern_10();

        obj.printPattern(5);
    }
    
}
