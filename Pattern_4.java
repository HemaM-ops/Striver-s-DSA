// M Hemasri - AIE22028
//03.08.2025 - Sunday

/* Pattern 5
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */
import java.util.Scanner;
public class Pattern_4 {

    public void printPattern4(int n){
        //outer loop - number of rows
        for(int i=0; i<n; i++){

            //inner loop - focus on columns and somehow connect to i
            for(int j=0;j< i+1 ; j++){
                //print the value of i+1 every time
                System.out.print((i+1) + " ");
            }
            System.out.println();//new line after each row
        }
    }

    public static void main(String[] args){

        Scanner sc4 = new Scanner(System.in);


        int n=sc4.nextInt();
        System.out.print("Enter the number of user inputs: ");

        //initialize the object of the Pattern_4 class
        Pattern_4 obj=new Pattern_4();

        for(int i=0; i<n; i++){
            System.out.println("Enter the no.of rows: ");
            int rows = sc4.nextInt();
            obj.printPattern4(rows);

        }

        sc4.close();

    }
    
}
