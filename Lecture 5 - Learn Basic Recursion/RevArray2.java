// M Hemasri - AIE22028
// 16.09.25 - Tuesday

// Reverse an array using recursion - One pointer approach

import java.util.Scanner;

public class RevArray2{

    public static void reverse(int i){
        if(i>= arr.length/2) return;
        swap(i,arr.length-i-1);
        reverse(i+1);
    }

    static int arr[];

    public static void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        reverse(0);

        System.out.println("Reversed Array: ");
        for(int i = 0; i<n; i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}