// M Hemasri - AIE22028
// 05.08.25 - Tuesday

/* Pattern 15
 * A B C D E
 * A B C D
 * A B C
 * A B
 * A
 */

public class Pattern_15 {

    public void printPattern(int n){

        /* //iCase - 1
        for(int i=n; i>=1; i--){

            //inner loop
            for(char ch='A'; ch <= 'A'+i-1; ch++){
                System.out.print(ch+" ");

            }
            System.out.println();
        }*/

        //case -2
        for(int i=1; i<=n; i++){

            for(char ch='A'; ch <= 'A' + n - i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Pattern_15 obj = new Pattern_15();
        obj.printPattern(5);
    }
    
}
