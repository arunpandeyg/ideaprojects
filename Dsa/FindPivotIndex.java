package Dsa;
//find out pivot number index


public class FindPivotIndex {
    public int pivotIndex(int[] nums){
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++){
            if (leftSum == totalSum - leftSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex fpi = new FindPivotIndex();
        int[] ip1 = {1,7,3,6,5,6};
        System.out.println(fpi.pivotIndex(ip1));
        int[] ip2 = {1,2,3};
        System.out.println(fpi.pivotIndex(ip2));
        int[] ip3 = {2,1,-1};
        System.out.println(fpi.pivotIndex(ip3));
        int[] ip4 = {-1, -1,-1,-1,-1,0};
        System.out.println(fpi.pivotIndex(ip4));
    }
}
