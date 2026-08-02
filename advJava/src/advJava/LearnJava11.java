package advJava;


import java.util.Scanner;

public class LearnJava11 {                      //palindrome or not check
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String for checking as Palindrome: ");
        String  word = sc.next();

        if (isPalindrome(word))
            System.out.println("\" "+word+ "\" is Palindrome ");
        else
            System.out.println("\" "+word+ "\"  is Not Palindrome");

    }
    static boolean isPalindrome(String word){
        int forwardIndex = 0, backwardIndex = word.length()-1;
        while (forwardIndex <= backwardIndex){
            char startChar = word.charAt(forwardIndex);
            char endChar = word.charAt(backwardIndex);

            if (startChar != endChar)
                return false;

            forwardIndex++;
            backwardIndex--;
        }
        return true;
    }
}
