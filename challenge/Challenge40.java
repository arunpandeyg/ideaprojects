package challenge;

import java.util.StringTokenizer;

public class Challenge40 {       //reverse a String
    public static void main(String[] args) {
        String str ="I am a java programmer";
        String[] st = str.split("");

        for (int j = st.length-1; j>=0; j--){
            System.out.print(st[j]);
        }
        System.out.println();
    }
}
//..............................

class Ch40{
    public static void main(String[] args) {

        String line = "I am a java programmer";
        StringTokenizer token = new StringTokenizer  (line);
        int i =0;

        int countToken = token.countTokens(); //return the count of string split by space.
        while (i<countToken){
            String reverse = (String)token.nextElement(); //next element return next token.
            char[]reverseString=reverse.toCharArray();
            int k = reverseString.length-1;
            for (int j = 0; j<reverseString.length/2;j++,k--){
                char temp = reverseString[j];
                reverseString[j]= reverseString[k];
                reverseString[k]=temp;
            }
            String s = new String(reverseString);
            System.out.println(s);
            i++;
        }
    }
}
