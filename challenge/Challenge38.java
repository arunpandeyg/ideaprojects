package challenge;

public class Challenge38 {       //strings converting upper case to lower case
    public static void main(String[] args) {
        String str = "YASHPANDEY";
        char []c = str.toCharArray();

        for (int i = 0; i< c.length; i++){
            if (c[i]>=65 && c[i]<=90){
                c[i]=(char) (c[i]+32);
                //System.out.print(c[i]);
            }
        }
        System.out.println("\nAfter conversion");
        for (int i = 0; i<c.length; i++){
            System.out.print(c[i]);
        }
    }
}
//.............

class Con{
    public static void main(String[] args) {
        String s = "MADAM";
        char[] c = s.toCharArray();

        for (int i = 0; i<c.length; i++){
            if (c[i]<97){
                c[i]=(char)(c[i]+32);
            }
            else {
                c[i]=(char)(c[i]+0);
            }
        }
        System.out.println(String.valueOf(c));
    }
}
