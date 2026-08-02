package challenge;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class Challenge22 {//Arrays revers the array without using duplicate array.

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int i = 0;
        int j = arr.length-1;

        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[]arr,int i,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
