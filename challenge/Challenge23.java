package challenge;

import java.util.Scanner;

public class Challenge23 {       //search duplicate elements
    public static void main(String[] args) {
        int count = 0,ele;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter Array elements");
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter a key");
        ele = sc.nextInt();

        for (int i =0; i<n; i++){
            if (a[i]==ele){
                count++;
            }
            else if (count==2){
                break;
            }
        }
        if (count>=2){
            System.out.println("Value is duplicated");
        }
        else {
            System.out.println("Not Duplicated");
        }
        sc.close();
    }
}
