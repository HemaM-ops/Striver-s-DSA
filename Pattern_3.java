//M Hemasri - AIE22028
//30.07.25 - Wednesday
/*Pattern
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */

import java.util.Scanner;
public class Pattern_3 {

    public void printPattern3(int t){
        for(int i=0; i<t; i++){
            for(int j=0; j<=i; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc3 = new Scanner(System.in);

        int n=sc3.nextInt();

        Pattern_3 obj = new Pattern_3();

        for(int i=0; i<n; i++){
            int t=sc3.nextInt();
            obj.printPattern3(t);
        }

        sc3.close();
        

    }
    
}
