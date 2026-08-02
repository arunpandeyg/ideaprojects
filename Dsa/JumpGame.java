package Dsa;
//jump game


public class JumpGame {
    public boolean canJump(int[] nums){
        if (nums.length == 0) return false;
        int maxReachableIndex = 0;
        for (int i = 0; i < nums.length; i++){
            if (maxReachableIndex < i) return false;
            maxReachableIndex = Math.max(maxReachableIndex, nums[i] + i);
        }
        return true;
    }


    public static void main(String[] args) {
        JumpGame jg = new JumpGame();
        System.out.println(jg.canJump(new int[]{2,3,1,1,4}));
        System.out.println(jg.canJump(new int[] {3,2,1,0,4}));
        System.out.println(jg.canJump(new int[] {0}));
    }
}
