// M Hemasri - AIE22028
// 28.08.25 - Thursday

// Day before n days

import java.util.Scanner;

public class Days{

    public int NumOfDays(int d, int n){

        int x = n%7;
        int ans = d-x;
        if(ans>0) return ans;
        else return (ans+7);

    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println(days);
        System.out.println("Enter the current days (1-7) starting from sunday: ");

        int d = sc.nextInt();
        System.out.println("Enter the no.of days to go back");
        int n = sc.nextInt();
        Days day = new Days();
        int result = day.NumOfDays(d,n);
        System.out.println("The day is: "+result+"-"+days[result]);


    }
}