package fajp;

import java.util.Scanner;

//palindrome number
public class FajpPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check palindrome:");
        int num = sc.nextInt();

        int org_num = num;
        int rev = 0;

        while (num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (org_num == rev){
            System.out.println(org_num +"  Palindrome Number");
        }
        else {
            System.out.println(org_num + "  Not a palindrome number");
        }
    }
}
//...................................
class PalindromeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();

        String org_str = str;
        String rev = " ";
        int len = str.length();

        for (int i = len-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        if (org_str.equals(str)){
            System.out.println(org_str + "  The String is palindrome ");
        }
        else {
            System.out.println(org_str + "  The String is Not palindrome ");
        }
    }

}
