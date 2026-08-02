package leetCode;
//reverse an integer or reverse a number


public class ReverseInteger11 {
    static int reverseString(int num){
        int reverse = 0;
        while (num != 0){
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println("5643 reverse is: " + reverseString(5643));
        System.out.println("95981 reverse is: " + reverseString(95981));
        System.out.println("987765 reverse is: " + reverseString(987765));
    }
}

class ReverseNumber11 {
    static int reverseNumber(int num){
        int reverse = 0;
        while (num != 0){
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println("5643 reverse is: " + reverseNumber(5643));
        System.out.println("95981 reverse is: " + reverseNumber(95981));
        System.out.println("987765 reverse is: " + reverseNumber(987765));
    }
}
