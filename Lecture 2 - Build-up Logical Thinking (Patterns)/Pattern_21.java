//M Hemasri - AIE22028
// 06.08.25 - Wednesday
/* Pattern 21
 *    *****
 *    *   *
 *    *   *
 *    *   *
 *    *****

 */


public class Pattern_21 {

    public void printPattern(int n){

        int stars;
        int spaces;

        //outer loop runs n times
        for(int i=1; i<=n; i++){
            /*   does not work becoz in the border conditions stars prints double times
            if(i==1 || i==n){
                stars=n;
                spaces=0;
            }
            else{
                stars=1;
                spaces=n-2;
            }

            //stars
            for(int j=1;j<=stars; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=stars; j++){
                System.out.print("*");
            }*/

            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                }
                System.out.println();
            }
            

        }
    

    public static void main(String args[]){
        Pattern_21 obj = new Pattern_21();

        obj.printPattern(5);


    }
    
}
