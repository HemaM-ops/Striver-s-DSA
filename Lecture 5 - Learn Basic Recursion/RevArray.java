// M Hemasri - AIE22028
// 16.09.25 - Tuesday

// Reverse an Array using Recursion - two pointers approach(left and right)

import java.util.Scanner;

public class RevArray{

    public static void reverse(int left,int right){

        if(left>= right){
            return;
        }
        swap(left,right);
        reverse(left+1, right-1);

    }

    public static void swap(int left, int right){
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }

    static int arr[];

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        reverse(0,n-1);
        sc.close();
        System.out.println("Reversed Array: ");
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}