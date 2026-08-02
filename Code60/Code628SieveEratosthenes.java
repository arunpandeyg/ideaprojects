package Code60;
//Sieve of Eratosthenes


import java.util.Scanner;

public class Code628SieveEratosthenes {
    static boolean[] allNumbers;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number 'n': ");
        int n = Integer.parseInt(sc.nextLine());
        sc.close();
        int arrSize = n + 1;

        CreateArray(arrSize);
        Sieve(arrSize);
    }
    static void Sieve(int n){
        for (int i = 2; i < n; i++){
            if (allNumbers[i]){
                for (int c = i; i * c < n; c++){
                    allNumbers[i * c] = false;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < n; i++){
            if (allNumbers[i]){
                System.out.print(i + " ");
                counter++;
            }
            if (counter == 10){
                System.out.println("\n");
                counter = 0;
            }
        }
    }
    static void CreateArray(int n){
        allNumbers = new boolean[n];
        for (int i = 0; i < n; i++){
            allNumbers[i] = true;
        }
    }
}










