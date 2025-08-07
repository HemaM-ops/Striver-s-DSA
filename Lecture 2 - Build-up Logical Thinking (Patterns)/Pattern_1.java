/* printing the below pattern
 * * * *
 *  * * *
 *  * * *
 *  * * *
 */


// To run dynamically
import java.util.Scanner;

public class Pattern_1{

    public void printPattern1(int t){

        // outer loop is responsible for rows
        for(int i=0 ; i < t; i++){

        //inner loop is for columns
        for(int j =0; j < t; j++){

            //printing the pattern
            System.out.print("* \t");
        }
        // print statement to start a new line after the inner loop ends
        System.out.println();


    }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //input the no.of rows

        int n = sc.nextInt();
        

        //creating an object of the class
        Pattern_1 obj= new Pattern_1();
        // obj.printPattern1(n);

        // Usually in online tests there will be multiple test cases
        //so we can use a loop for the test cases to run


        for(int i=0; i<n ; i++){
            int t= sc.nextInt();
            obj.printPattern1(t);
        }

        sc.close();


        // // outer loop is responsible for rows
        // for(int i=0 ; i < 4; i++){

        // //inner loop is for columns
        // for(int j =0; j < 4; j++){

        //     //printing the pattern
        //     System.out.print("* \t");
        // }
        // // print statement to start a new line after the inner loop ends
        // System.out.println();

        // }
    }
}