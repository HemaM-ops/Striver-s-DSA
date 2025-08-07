//M Hemasri - AIE22028
// 05.08.25 - Tuesday

/* Pattern 18
 * E
 * D E
 * C D E
 * B C D E
 * A B C D E
 */

public class Pattern_18 {

    public void printPattern(int n){

        //outer loop runs for n times
        for(int i=1; i<=n; i++){

            //inner loop
            //something new
            //char ch=(char)('A'+(n-i));

            //loop for pattern
            //printing characters from ch to 'E'
            for(char ch=(char)('E'-i+1); ch <='E';ch++){
                System.out.print(ch+" ");
                //ch++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Pattern_18 obj = new Pattern_18();
        obj.printPattern(5);
    }
    
}
