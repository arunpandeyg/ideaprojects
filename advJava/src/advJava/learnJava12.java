package advJava;


import java.util.Scanner;

public class learnJava12 {                             //string reverse
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Line of Text: ");
        String text = sc.nextLine();

        String revText =reverseString(text);
        System.out.println("Input Text: " +text);
        System.out.println("Reverse Text: " +revText);
    }
    static String reverseString(String text){
        String[] words = text.split("");
        String revString = "";
        for (String word : words){
            StringBuilder sb = new StringBuilder(word);
            revString = revString + sb.reverse()+"";
        }
        return revString;
    }
}
