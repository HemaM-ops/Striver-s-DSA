//M Hemasri - AIe22028
//05.08.25 - Tuesday
/*Pattern 13
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * */


public class Pattern_13 {

    public void printPattern(int n){
        int num=1;

        //outer loop runs n times
        for(int i=1; i<=n ; i++){

            //inner loop runs i times and prints the pattern with the help of num variable
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
            
        }

    }

    public static void main(String args[]){
        Pattern_13 obj = new Pattern_13();
        obj.printPattern(5);
    

}
    
}
