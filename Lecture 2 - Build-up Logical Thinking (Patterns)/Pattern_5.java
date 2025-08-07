//M Hemasri - AIE22028
// 03.08.25 - Sunday

/*Pattern 5
 * * * * *
 * * * *
 * * *
 * *
 *
 */

public class Pattern_5 {

    public void printPattern5(int n){

        //outer loop - number of rows
        // since the pattern prints in reverse order
        for(int i=n; i>0; i--){
            for(int j=0;j<i;j++){
                //print * every time
                System.out.print("* ");
            }
            System.out.println();
        }
        /*  for(int i=0; i<n; i++){
                for(int j=0; j<(n-i);j++){
                    System.out.print("* ");
                }
                System.out.println();
            }*/
    }
    public static void main(String[] args){

        Pattern_5 obj=new Pattern_5();
        obj.printPattern5(5);


    }
}
