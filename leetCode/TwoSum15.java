package leetCode;
//two Sum


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum15 {
    public static int[] twoSum(int[] input, int target){
        if (input == null || input.length < 2){            //if array is empty of less than 2 elements.
            throw new IllegalArgumentException("Invalid input array");
        }
        Map<Integer, Integer> tracerMap = new HashMap<>();
        for (int i = 0; i < input.length; i++){            //iterate over the array
            int pair = target - input[i];                  //find fair of the target
            if (tracerMap.containsKey(pair)){
                return new int[]{tracerMap.get(pair), i};  //get both values of pair
            }
            tracerMap.put(input[i], i);                    //get both indexes of the sum elements
        }
        throw new IllegalArgumentException("Invalid input, no two sum is found");
    }

    public static void main(String[] args) {
        int[] i = {3,4,7};
        int[] i2 = {2, 7, 11, 15};
        System.out.println("Indexes of two sum: " + Arrays.toString(twoSum(i, 10)));
        System.out.println("Indexes of two sum: " + Arrays.toString(twoSum(i2, 9)));
    }
}


