package Dsa;
//first unique character in a String

public class FirstUniqueChar {
    public int firstUniqChar(String s){
        if (s == null || s.length() == 0)return - 1;
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++){
            charCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1)return i;
        }
        return - 1;
    }


    public static void main(String[] args) {
        FirstUniqueChar fuc = new FirstUniqueChar();
        System.out.println("unique first char in \"java\" at: " +fuc.firstUniqChar("java"));
        System.out.println("unique first char in \"meme\" at: " +fuc.firstUniqChar("meme"));
        System.out.println("unique first char in \"elephant\" at: " +fuc.firstUniqChar("elephant"));

    }
}
