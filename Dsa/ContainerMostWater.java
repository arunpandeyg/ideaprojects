package Dsa;
//container with most water


public class ContainerMostWater {
    public  int maxArea(int[] height){
        if(height == null || height.length < 2){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while (left < right){
            int shortestheight = Math.min(height[left], height[right]);
            max = Math.max(max, shortestheight * (right - left));
            if (height[left] < height[right]){
                left++;
            }
            else right--;
        }
        return max;
    }


    public static void main(String[] args) {
        int[] input = {1,8,6,2,5,4,8,3,7};
        ContainerMostWater cwm = new ContainerMostWater();
        System.out.println(cwm.maxArea(input));
    }
}
