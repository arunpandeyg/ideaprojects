package Dsa;
// trapping maximum rain water


public class TrappingRainWater {
    public  int trap(int[] height){
        int result = 0;
        int leftMax = 0;
        int rightMax = 0;
        int low = 0;
        int high = height.length -1;
        while (low <= high){
            if (height[low] < height[high]){
                if (height[low] > leftMax){
                    leftMax = height[low];
                }else {
                    result += leftMax - height[low];
                }
                low++;
            }else {
                if (height[high] > rightMax){
                    rightMax = height[high];
                }else {
                    result += rightMax - height[high];
                }
                high--;
            }

        }
          return result;
    }

    public static void main(String[] args) {
        TrappingRainWater trw = new TrappingRainWater();
        System.out.println(trw.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(trw.trap(new int[] {4,2,0,3,2,5}));
    }
}
