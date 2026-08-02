package Dsa;
//missing number
// n(n+1)/2 == sum of n natural numbers, there can be integer overflow, xor is the best approach.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {
    public int missingNumber(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            result ^= (i + 1)^ nums[i];
        }
        return result;
    }


    public static void main(String[] args) {
        MissingNumber ms = new MissingNumber();
        System.out.println(ms.missingNumber(new int[] {3,0,1}));
        System.out.println(ms.missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
        System.out.println(ms.missingNumber(new int[] {0,1}));
    }
}

