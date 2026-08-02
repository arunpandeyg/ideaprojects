package Dsa;
//merge sorted array


import java.util.Arrays;



class MergeSArray{
    public void merge(int[] nums1, int m, int[] nums2, int n){
        if (nums1 == null || nums2 == null || n == 0){
            return;
        }
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0){
            if (nums1[i] >= nums2[j]){
                nums1[k--] = nums1[i--];

            }else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0){
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        MergeSArray msa = new MergeSArray();
        int[] nums1 = {2,3,4,0,0,0};
        int m = 3;
        int[] nums2 = {1,5,6};
        int n = 3;
        msa.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}