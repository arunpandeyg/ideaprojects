package challenge;

import java.util.Arrays;




public class Challenge29 {     //send all the zero to the end of the array
    public static void main(String[] args) {
        int[] arr = {0,0,5,6,0,0,7,0,0,2,7,7};
        int i =0;
        int j = arr.length-1;
        while (i<=j){
            while (arr[i]!=0){
                i++;
            }
            while (arr[j]==0){
                j--;
            }
            swap(arr,i,j);
            if (i<j){
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
        public static  void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

   }
