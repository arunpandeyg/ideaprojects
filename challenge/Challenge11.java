package challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {

        System.out.println("Enter size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the Array Elements; ");
        int sum = 0;

        for (int i = 0; i< size; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];

        }
        System.out.println("Element of the Array: "+Arrays.toString(arr));
        System.out.println("The sum of the Element is: "+sum);
    }
}

