//M Hemasri - AIE22028
// 05.08.25 - Tuesday

/*Pattern 11
 1
 0 1 
 1 0 1
 0 1 0 1
 1 0 1 0 1
 */

public class Pattern_11 {

    public void printPattern(int n){
        //num for applying mod and printing pattern
        int num;

        //outer loop runs n times
        for(int i=1; i<=n; i++){

            if(i%2==0){
                num=0;
            }
            else{
                num=1;
            }


            //inner loop runs i times and prints the pattern with the help of num
            for(int j=1; j<=i; j++){
                System.out.print(num%2 +" ");
                num++;
            }

            System.out.println();

        }
    }

    public static void main(String args[]){
        Pattern_11 obj= new Pattern_11();

        obj.printPattern(5);
    }
    
}
