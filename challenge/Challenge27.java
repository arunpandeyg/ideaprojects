package challenge;

import java.util.Scanner;

public class Challenge27 {    //passing array as a parameter
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        display(a);
    }
    static void display(int []a){
        for (int i : a){
            System.out.print(i+ " ");
        }

    }
}
class Ch27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[5];
        System.out.println("Enter 5 Array elements");
        for (int i = 0; i< a.length; i++){
            int x = sc.nextInt();
            a[i]=x;
        }
        display(a);
    }
    private static void display(int[] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
