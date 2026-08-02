package Dsa;
//sort the colors


import java.util.Arrays;

public class SortColor {
public void sortColors(int[] nums){
    int left = 0;
    int right = nums.length -1;
    int curr = 0;
    while (curr <= right){
        if (nums[curr] == 0){
            swap(nums, curr++, left++);
        }
        else if (nums[curr] == 2){
            swap(nums, curr, right--);
        }else {
            curr++;
        }
    }
}
private void swap(int[] nums, int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

    public static void main(String[] args) {
    int[] nums = {2,0,2,1,1,0};
    SortColor sc = new SortColor();
    sc.sortColors(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums1 = {1,0,2,0,2,1,2,1,0};
        sc.sortColors(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
