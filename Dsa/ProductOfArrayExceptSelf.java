package Dsa;
//product of array except self


import java.util.Arrays;

public class ProductOfArrayExceptSelf {
      public int[] productExceptSelf(int[] nums){

          int[] result = new int[nums.length];

          result[nums.length - 1] = 1;

          for (int i = nums.length - 2; i >= 0; i--){
              result[i] = result[i + 1 ] * nums[i + 1];
          }
          int left = 1;
          for (int i = 0; i < nums.length; i++){
              result[i] = result[i] * left;
              left = left * nums[i];
          }
          return result;
      }

    public static void main(String[] args) {
         ProductOfArrayExceptSelf poaes = new ProductOfArrayExceptSelf();
         System.out.println(Arrays.toString(poaes.productExceptSelf(new int[] {1,2,3,4})));
         System.out.println(Arrays.toString(poaes.productExceptSelf(new int[] {-1,1,0,-3,3})));
    }
}
