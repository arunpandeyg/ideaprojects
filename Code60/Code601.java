package Code60;
//Write a program that creates and prints a random phone number of the form xxx xxx xxxx.
//include the dashes in the output. Do not let the first three digits contain an 8 or 9
//(but don't be more restrictive than that) and make sure that the second set of three digits
//is no greater than 742.

import java.util.Random;

public class Code601 {   // generate a random phone number
    public static void main(String[] args) {
        Random rand = new Random();
        int first = rand.nextInt(8);    //you can change these 4 strings to get different number combinations.
        int second = rand.nextInt(8);
        int third = rand.nextInt(8);
        int middle = rand.nextInt(742);
        int last = rand.nextInt(9999);

        String middleString;
        String lastString;

        middleString = Integer.toString(middle);
        lastString = Integer.toString(last);

        while(middleString.length()< 3){
            middleString = "0" + middleString;
        }
        while (lastString.length()< 4){
            lastString = "0" + lastString;
        }
        System.out.println("The random phone number: "+ Integer.toString(first)+Integer.toString(second)
                +Integer.toString(third)+"-"+middleString+"-"+lastString);

    }
}

