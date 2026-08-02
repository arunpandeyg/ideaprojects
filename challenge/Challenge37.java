package challenge;

import java.util.Random;

public class Challenge37 {     //alphanumeric String generation
    public static void main(String[] args) {
        String src = "abcd01ABC";
        char [] ch =src.toCharArray();

        for (int i = 0;i<5; i++){
            Random rn = new Random(8);
            int k = rn.nextInt();

            System.out.println(ch[k]);
        }

    }
}
class Challang37{
    public static void main(String[] args) {
        String atoZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123"; //36 LETTERS
        String randomStr = generateRandom(atoZ);
        System.out.println(randomStr);
    }
    private static String generateRandom(String atoZ){
        Random rand = new Random();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i<17; i++){
            int randIndex=rand.nextInt(atoZ.length());
            System.out.print(randIndex+", ");
            res.append(atoZ.charAt(randIndex));
        }
        return res.toString();
    }
}
