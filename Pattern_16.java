//M Hemasri - AIE22028
//05.08.25 - Tuesday
/* Pattern 16
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 */
public class Pattern_16 {

    public void printPattern(int n){

        char ch ='A';

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print(ch);
            }


            System.out.println();
            ch++;

        } 
        
    }

    public static void main(String args[]){
        Pattern_16 obj = new Pattern_16();
        obj.printPattern(5);
    }
    
}
