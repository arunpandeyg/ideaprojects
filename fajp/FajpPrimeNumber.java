package fajp;
//check given number is prime or not, the number should have 2 factors 1 and itself,


public class FajpPrimeNumber {
    public static void main(String[] args) {
    int num = 3;
    int count = 0;

    if (num > 1){
        for (int i = 1; i <= num; i++){
            if (num % i == 0)
                count++;
        }
        if (count == 2){
            System.out.println(num + "  is a prime number");
        }
        else {
            System.out.println(num + "  not a prime number");
        }
    }
    else {
        System.out.println("   Not a prime number: ");
    }
    }
}
