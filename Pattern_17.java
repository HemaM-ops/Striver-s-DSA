// M Hemasri - AIE22028
// 05.08.25 - Tuesday

/* Pattern 17
 *    A
 *   ABA
 *  ABCBA
 * ABCDCBA
 */

public class Pattern_17 {

    public void printPattern(int n){
        //outer loop runs for n times
        for(int i=1; i<=n; i++){

            //loop for spaces = n-i
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }

            //loop for pattern
            char ch='A';
            for(int k=1; k<=2*i-1; k++){
                System.out.print(ch);
                if(k>=i){
                    ch--;
                }
                else{
                    ch++;
                }
                }
                System.out.println();
            }


        }

        public static void main(String[] args){
            Pattern_17 obj = new Pattern_17();
            obj.printPattern(4);
        }
    }
    

