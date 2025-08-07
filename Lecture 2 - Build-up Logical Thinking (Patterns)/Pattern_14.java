// M Hemasri - AIE22028
// 05.08.25 - Tuesday

/* Pattern 14
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 */

public class Pattern_14 {

    public void printPattern(int n){

        //outer loop run n times
        for(int i=1; i<=n; i++){
            //inner loops print alphabets
            //new trick: use char to print characters directly
            //Eg. char ch = 'A'; ch <= 'A'+i;
            for(char ch='A'; ch<= 'A'+i-1 ; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Pattern_14 obj = new Pattern_14();
        obj.printPattern(5);
    }
    
}
