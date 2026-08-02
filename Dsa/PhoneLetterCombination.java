package Dsa;
//letter combination of a phone number pad


import java.util.LinkedList;
import java.util.List;

public class PhoneLetterCombination {
    public List<String> letterCombination(String digits){
        LinkedList<String> result = new LinkedList<>();
        if (digits.length() == 0) return result;
        String[] numChars = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        for (int i = 0; i < digits.length(); i++){
            int index = Character.getNumericValue(digits.charAt(i));
            while (result.peek().length() == i){
                String comb = result.remove();
                for (char c : numChars[index].toCharArray()){
                    result.add(comb + c);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PhoneLetterCombination plc = new PhoneLetterCombination();
        System.out.println(plc.letterCombination("23"));
        System.out.println(plc.letterCombination("5"));
    }
}
