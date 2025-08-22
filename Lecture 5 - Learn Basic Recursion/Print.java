// M Hemasri - AIE22028
// 22.08.25 - Friday

// Print N times using recursion
public class Print{
    public static int count = 0;

    public void PrintN(){
        if(count == 4) return;
        else{
            System.out.println(count);
            count++;
            PrintN();
        }

    }


    public static void main(String[] args){
        Print p = new Print();
        p.PrintN();

    }
}
