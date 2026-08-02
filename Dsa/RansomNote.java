package Dsa;
//ransome note


public class RansomNote {
    public boolean canConstruct(String ransomeNote, String magazine){
        if (ransomeNote == null || magazine == null)return false;
        int[] charTrack = new int[26];
        for (int i = 0; i < magazine.length(); i++){
            charTrack[magazine.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < ransomeNote.length(); i++){
            if (-- charTrack[ransomeNote.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
    RansomNote rn = new RansomNote();
        System.out.println(rn.canConstruct("aa", "aab"));
        System.out.println(rn.canConstruct("aa", "ab"));
    }
}
