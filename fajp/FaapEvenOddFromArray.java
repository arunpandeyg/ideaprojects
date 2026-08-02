package fajp;

public class FaapEvenOddFromArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};

        //extracting even numbers
        System.out.println("Even number:  ");
        for (int i = 0; i < a.length; i++){
           if(a[i] % 2 == 0)
               System.out.println("Even: " +a[i]);
        }
        //enhanced for loop
        System.out.println("Enhanced for loop ");
        System.out.println("Even number:  ");
        for (int k : a) {
            if (k % 2 == 0)
                System.out.println("Even: " + k);
        }
        System.out.println("odd numbers:   ");
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 != 0) {
                System.out.println("Odd:  " + a[i]);
            }
        }
        //enhanced for each loop
        System.out.println("Enhanced for loop ");
        System.out.println("odd numbers:   ");
        for (int j : a) {
            if (j % 2 != 0) {
                System.out.println("Odd:  " + j);
            }
        }
    }
}
