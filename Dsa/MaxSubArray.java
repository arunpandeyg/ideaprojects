package Dsa;
//find out maximum sub array


public class MaxSubArray {
    public int maxSubArray(int[] nums){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int n : nums){
            sum += n;
            if (sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubArray msa = new MaxSubArray();
        System.out.println(msa.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(msa.maxSubArray(new int[] {5,4,-1,7,8}));
        System.out.println(msa.maxSubArray(new int[] {1}));
    }
}
