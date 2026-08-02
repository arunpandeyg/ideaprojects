package Dsa;
//find the largest odd number in string


public class LargestOddNumber {
    public String largestOddNumber(String num){
        for (int i = num.length() - 1; i >= 0; i--){
            char c = num.charAt(i);
            if (c % 2 == 1){
                return num.substring(0, i + 1);
            }
        }
        return " ";
    }

    public static void main(String[] args) {
        LargestOddNumber lon = new LargestOddNumber();
        System.out.println(lon.largestOddNumber("223309"));
        System.out.println(lon.largestOddNumber("52"));
        System.out.println(lon.largestOddNumber("4206"));
        System.out.println(lon.largestOddNumber("3542"));
    }
}
