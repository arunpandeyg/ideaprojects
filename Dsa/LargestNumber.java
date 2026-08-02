package Dsa;
//largest number, string comparison based sorting,


import java.util.Arrays;

public class LargestNumber {
    public String largeNumber(int[] nums){
        if (nums == null || nums.length == 0){
            return " ";
        }
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (str1, str2) -> (str2 + str1).compareTo(str1 + str2));
        if (strs[0].charAt(0) == '0') return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : strs){
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
    LargestNumber ln = new LargestNumber();
    int[] inp_1 = {10,2};
    int[] inp_2 = {3,30,34,5,9};
        System.out.println(ln.largeNumber(inp_1));
        System.out.println(ln.largeNumber(inp_2));
    }
}
