// M Hemasri - AIE22028
// 05.08.25 - Tuesday

/*Pattern 8
*********
 *******
  *****
   ***
    *
*/
//two ways to solve the problem

public class Pattern_8{

    // 1. Iterating i from n to 1 and printing the pattern
    public void printPattern8_1(int n){

        for(int i = n; i >= 1; i--){

            //for loop for spaces
            for(int j = 1; j<= (n-i); j++){
                System.out.print(" ");

            }

            //for loop for stars
            for(int k=1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //2. Iterating i from 1 to n and printing the pattern
    public void printPattern8_2(int n){
        for(int i=1; i<= n; i++){

            //for loop for spaces
            for(int j=1; j<=(i-1); j++){
                System.out.print(" ");
            }
            //for loop for stars
            for(int k=1; k <= (2*(n-i)+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        Pattern_8 obj= new Pattern_8();
        obj.printPattern8_1(5);

        obj.printPattern8_2(5);
    }
    

}

