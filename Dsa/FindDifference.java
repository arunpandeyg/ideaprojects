package Dsa;
//find the difference


public class FindDifference {
    public char findTheDifference(String s, String t){
        char result = 0;
        for (char c : s.toCharArray()){
            result ^= c;
        }
        for (char c : t.toCharArray()){
            result ^= c;
        }
        return result;
    }
    public static void main(String[] args) {
          FindDifference fd = new FindDifference();
        System.out.println(fd.findTheDifference("abcd", "abcde"));
    }
}
