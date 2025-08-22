// M HEMASRI - AIE22028
// 22.08.25 - Friday

// PRINT NAME 5 TIMES USING RECURSION

import java.util.Scanner;

public class PrintName{
    public static int count=0;

    public void printName(int i,int n){
        if(i>n) return;
        System.out.println("Hemasri");
        count++;
        printName(i+1,n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintName p = new PrintName();
        System.out.println("Type the number of times you want you print your name: ");
        int n = sc.nextInt();

        p.printName(1,n);
        sc.close();
    }
}