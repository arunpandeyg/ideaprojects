package Dsa;
//find all duplicates in an array


import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums){

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0){
                result.add(index + 1);
            }
            nums[index] = nums[index] * -1;
        }
        return result;
    }

    public static void main(String[] args) {
         FindDuplicates fd = new FindDuplicates();
         System.out.println(fd.findDuplicates(new int[] {4,3,2,7,8,2,3,1}));
         System.out.println(fd.findDuplicates(new int[] {1,1,2}));
    }
}
