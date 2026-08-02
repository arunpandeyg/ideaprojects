package leetCode;
//how to plus one number in the last number of the linked list.


import java.util.Arrays;

public class PlusOne4 {
    public static int[] plusOne(int[] input){
        for (int i = input.length - 1; i >= 0; i--){    //iterating from end
            if (input[i] < 9){                          //if last digit is < 9
                input[i]++;                             //increase it by one and
                return input;                           //return
            }
            input[i] = 0;                               //if digit is nine replace with 0
        }
        int[] result = new int[input.length + 1];       //if array has all nine create new array with one more index
        result[0] = 1;                                  //replace 0 index with one (999+1 = 1000)
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Inout:[1,2,3] Output: " + Arrays.toString(plusOne(new int[]{1,2,3})));
        System.out.println("Inout:[1,0,9] Output: " + Arrays.toString(plusOne(new int[]{1,0,9})));
        System.out.println("Inout:[2,9,9] Output: " + Arrays.toString(plusOne(new int[]{2,9,9})));
        System.out.println("Inout:[9,9,9] Output: " + Arrays.toString(plusOne(new int[]{9,9,9})));
        System.out.println("Inout:[4,9,9,9] Output: " + Arrays.toString(plusOne(new int[]{4,9,9,9})));
    }
}
