package fajp;
//reversing words from an String line of words.
public class FajpReverseEachWord {
    //approach 1
    public static void main(String[] args) {
        System.out.println("Original String--\nWelcome to Java");
        String str = "Welcome to Java"; //original string
        String[] words =  str.split(" ");
        String reverseString = "";
        for (String w : words){
            String reverseword = "";
            for (int i = w.length() -1; i >= 0; i--){
                reverseword = reverseword + w.charAt(i);
            }
            reverseString = reverseString + reverseword + " ";
        }
        System.out.println("Reverse String of words is: \n" +reverseString);
    }
}
class SBu{  //approach 2
    public static void main(String[] args) {
        String str = "Welcome to Java";
        String[] words = str.split("\\s");
        String reverseword = "";
        for (String w : words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseword = reverseword + sb.toString() + " ";
        }
        System.out.println("Reverse String of words is: " +reverseword);
    }
}
