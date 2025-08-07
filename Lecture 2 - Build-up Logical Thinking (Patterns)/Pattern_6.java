// M Hemasri - AIE22028
// 03.08.25 - Sunday

/*Pattern 6
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2 
 * 1
 */

public class Pattern_6{

    public void printPattern6(int n){

        //outer loop - number of rows
        // i should be <= n, because we are starting i from 1. Initially missing it did not print 1 in the last row
        for(int i=1; i<=n; i++){

            //inner loop - columns and somehow connect the logic of patter to i
            // if we don't use <=, the last column will not printed (eg: for j=5 in row 1)
            for(int j=1; j<=(n-i+1); j++){
                //simply print the value of j every time in the same row - i
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }

    public static void main(String args[]){
        Pattern_6 obj=new Pattern_6();
        obj.printPattern6(7);

    }
}