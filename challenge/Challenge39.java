package challenge;

public class Challenge39 {   //2 strings are anagrams to each other or not.
    public static void main(String[] args) {
        int flag = 0;
        String s1 = "Army";
        String s2 = "Mary";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        if (c1.length==c2.length && c1!=null && c2!=null){
            for (int i = 0; i<c1.length; i++){
                for (int j = 0; j < c2.length; j++){
                    if (c1[i]==(char)(c2[j]+32)||c1[i]==(char)(c2[j]-32)||c1[i]==c2[j] ){
                        System.out.println(c1[i]+" "+c2[j]);
                        flag++;
                    }
                }
            }
            System.out.println(flag);
            if (flag==c1.length){
                System.out.println("Array having same elements hence are anagrams");
            }

            else {
                 System.out.println("Array not having same elements, not anagrams");
            }

            }
             else {
                System.out.println("Array is not equal in length or any of them are null");
        }

    }

}
class Ch39 {
    public static void main(String[] args) {
        String s1 = "Army";
        String s2 = "Mary";
        StringBuilder sb = new StringBuilder();
        boolean areMatching = false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        String ss1 = convertIntoSb(c1);
        String ss2 = convertIntoSb(c2);
        if (ss1.length() != ss2.length()) {
            System.out.println(ss1 + ",  and-" + ss2 + ",  are not anagram");
        } else {
            for (int x = 0; x < ss1.length(); x++) {
                areMatching = false;
                for (int y = 0; y < ss2.length(); y++) {
                    if (isCharEquivalente(ss1.charAt(x), ss2.charAt(y))) {
                        areMatching = true;
                        break;
                    } else {
                        areMatching = false;
                        continue;
                    }
                }
                if (areMatching) {
                    continue;
                } else {
                    break;
                }
            }
            if (areMatching) {
                System.out.println(ss1 + ",  and-  " + ss2 + ",  are anagram");
            } else{
                System.out.println(ss1 + ",  and-  " + ss2 + ",  are not anagram");
            }
        }
    }
            private static boolean isCharEquivalente(char charOut,char charIn){
             if (charOut>=97){
                 charOut =(char)(charOut - 32);
             }
             if (charIn>=97){
                 charIn = (char)(charIn - 32);
             }
             return charOut==charIn;
          }
          private static String convertIntoSb(char[]c1){
        StringBuilder sbl = new StringBuilder();
        for (int i = 0; i<c1.length;i++){
            if ((c1[i]>=65 && c1[i]<=90)||(c1[i]>=97 && c1[i]<=122)){
                sbl.append(c1[i]);
            }
        }
        return sbl.toString();
    }

}
