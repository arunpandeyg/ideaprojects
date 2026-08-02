package Dsa;
//longest common prefix


public class LongestCommonPrefix {
public String longestCommonPrefix(String[] inputArr){
    if (inputArr == null || inputArr.length == 0) return "";
    if (inputArr.length == 1)return inputArr[0];
    int minlen = inputArr[0].length();
    for (int i = 1; i < inputArr.length; i++){
        minlen = Math.min(minlen, inputArr[1].length());
    }
    for (int i = 0; i < minlen; i++){
        char current = inputArr[0].charAt(i);
        for (String str : inputArr){
            if (str.charAt(i) != current) {
                return str.substring(0, i);
            }
        }
    }
    return inputArr[0].substring(0,minlen);
}

    public static void main(String[] args) {
        LongestCommonPrefix lop = new LongestCommonPrefix();
        String[] inputArr = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix: " + lop.longestCommonPrefix(inputArr));
        String[] intputArr1 = {"tolet", "to", "tool"};
        System.out.println("Longest common prefix: " + lop.longestCommonPrefix(intputArr1));
        String[] intputArr2 = {"oots", "egg", "election"};
        System.out.println("Longest common prefix: "+lop.longestCommonPrefix(intputArr2));
    }
}
