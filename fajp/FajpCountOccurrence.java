package fajp;
//count occurrences of a character in a string.


public class FajpCountOccurrence {
    public static void main(String[] args) {
        String s = "java Programming Java Oops";

        int totalcount = s.length();   //total length of a string

        int totalcount_afterRemove = s.replace("a", "").length(); //total length after removing a's.
        int count = totalcount - totalcount_afterRemove;

        System.out.println("Number occurrences of a is: "+count);
    }
}
