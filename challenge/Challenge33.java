package challenge;

import java.util.Scanner;

public class Challenge33 {   //String contains digit or not, find out.
    public static <Char> void main(String[] args) {
        String str = "aassddf9ddffgghhjklmnop";

        //creating array and storing array.
        //retured by toCharArray().

        char[] ch = str.toCharArray();
        int lenght = ch.length;
        //printing array

        for (int i = 0; i < lenght; i++){
            if (Character.isDigit(ch[i])){
                //sb.append(c);
                System.out.println("contains: "+ch[i]);
            }
        }
    }
}

class Ch{
    public static void main(String[] args) {
        String str = "abcd123efgh456";
        char[] arr = str.toCharArray();
        int count = 0;
        for (char c : arr){
            if (Character.isDigit(c)){
                System.out.print(c+", ");
            }
        }
    }
}

class Ch33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sc.next();
        int count = 0;

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++){
            if (ch[i]>=48 && ch[i]<=57){
                System.out.println("String contains digit");
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("String contains Alphabet");
        }

    }
}
