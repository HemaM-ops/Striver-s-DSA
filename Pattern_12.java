//M Hmeasri - AIE22028
// 05.08.25 - Tuesday
/* PAttern 12
1      1
12    21
123  321
12344321
*/

public class Pattern_12 {

    public void printPattern(int n){

        //outer loop runs from 1 to n
        for(int i=1; i<=n; i++){

            //loop for printing first half of the pattern
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            //loop for spaces
            for(int k=1; k<=2*(n-i);k++){
                System.out.print(" ");
            }

            //loop for printing second half of the pattern
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String args[]){
        Pattern_12 obj = new Pattern_12();
        obj.printPattern(4);
    }
    
}
