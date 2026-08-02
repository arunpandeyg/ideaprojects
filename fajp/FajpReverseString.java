package fajp;
//
public class FajpReverseString {
    public static void main(String[] args) {
        //using + (String concatenation) operator
        String str = "ABCD ";
        String rev = " ";
        /* int len = str.length();  //4  = 0 + 3,
        for (int i = len-1;i>=0;i--){
            rev = rev + str.charAt(i);   //DCBA
        }
        System.out.println("Reverse string is:  " + rev); */

        //2 using character array

       /* char []a = str.toCharArray();
        int lan = a.length;
        for (int i = lan - 1; i >= 0; i-- ){
            rev = rev + a[i];
        }
        System.out.println("Revers String by using charArray: "+rev); */

        //by using string buffer class
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reverse String by using stringBuffer class: " +sb.reverse());
    }
}
