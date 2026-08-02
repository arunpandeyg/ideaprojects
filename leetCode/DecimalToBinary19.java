package leetCode;
//convert decimal number to binary format using numeric operations.


import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary19 {
    private String convertDecimalToBinary(int number){
        List<Integer> tempList = new ArrayList<>();
        while (number > 0){
            tempList.add(number % 2);
            number = number / 2;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = tempList.size() - 1; i >= 0; i--){
           sb.append(tempList.get(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        DecimalToBinary19 dtb = new DecimalToBinary19();
        System.out.println(dtb.convertDecimalToBinary(50));
    }
}
