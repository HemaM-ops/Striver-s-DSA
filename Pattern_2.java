//M Hemasri - AIE22028
//30.07.25 - Wednesday
/*Pattern
 *
 * *
 * * *
 * * * *
 * * * * *
 */

import java.util.Scanner;
public class Pattern_2 {

    public void printPattern2(int t){

        for(int i=0; i<t; i++){
            //outer loop for rows
            for(int j=0; j<=i; j++){
                //inner loops for columns
                System.out.print("* \t");
            }
            System.out.println();
        }

    }


    public static void main(String args[]){
        Scanner sc2 = new Scanner(System.in);

        Pattern_2 obj = new Pattern_2();


    // input for no.of test cases

    int n=sc2.nextInt();

    for(int i=0; i<n;i++){
        int t=sc2.nextInt();
        obj.printPattern2(t);
    }

    sc2.close();
    }

    

    
}
