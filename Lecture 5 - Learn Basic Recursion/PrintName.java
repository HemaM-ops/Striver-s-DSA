// M HEMASRI - AIE22028
// 22.08.25 - Friday

// PRINT NAME 5 TIMES USING RECURSION

public class PrintName{
    public static int count=0;

    public void printName(){
        if(count==5) return;
        System.out.println("Hemasri");
        count++;
        printName();
    }

    public static void main(String[] args){
        PrintName p = new PrintName();
        p.printName();
    }
}