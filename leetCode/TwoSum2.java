package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public static int[] twoSum(int[] inputArr, int target){
        if (inputArr == null || inputArr.length < 2){
            throw  new IllegalArgumentException("Invalid input array");
        }
        Map<Integer, Integer> trackerMap = new HashMap<>();
        for (int i = 0; i < inputArr.length; i++){
            int rem = target - inputArr[i];
            if (trackerMap.containsKey(rem)){
                return  new int[]{trackerMap.get(rem),i};
            }
            trackerMap.put(inputArr[i],i);
        }
        throw new IllegalArgumentException("Invalid input, now two sum is found...");
    }

    public static void main(String[] args) {
        int[] i = {3,4,7};
        System.out.println(Arrays.toString(twoSum(i,10)));
        i = new int[]{6, 34, 23, 89, 90, 45};
        System.out.println(Arrays.toString(twoSum(i,113)));
    }
}