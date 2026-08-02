package fajp;
//sum of digits
public class FajpSumDigits {
    public static void main(String[] args) {
        int num = 1123454;
        int sum = 0;

        while (num > 0){
            num = num / 10;
            sum = sum + num % 10;


        }
        System.out.println("Sum of the given number: "+sum);
    }
}
