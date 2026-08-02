package challenge;

import java.util.Scanner;

public class Challenge36 {    //given string is palindrome or not
    public static void main(String[] args) {
        String str = "RADAR";
        char[] charray = str.toCharArray();
        int k = charray.length;

        int flag = 0;
        for (int i = 0, j = k - 1; i < k && j > 0; i++, j--){
            if (charray[i]!=charray[j]){
                flag++;
            }

        }
        if (flag==0){
            System.out.println(str+ "  String is palindrome");
        }
        else {
            System.out.println(str+ "  String is not palindrome");
        }
    }

}

//.......................................................

class Ch36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length-1;
        int count =0;
        while (i<j){
            if (c[i]!= c[j]){
                count++;
                break;
            }
            i++;
            j--;
        }
        if (count==0){
            System.out.println(s+" is palindrome");
        }
        else {
            System.out.println(s+" in not palindrome");
        }
    }
}
