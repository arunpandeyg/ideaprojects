package fajp;
//swapping of numbers 5 types


public class FajpSwap {
    public static void main(String[] args) {
    int a = 10, b = 20;
        System.out.println("Before swapping values are " +a+ " "+b);
        //logic 1 by third variable
       /* int t = a;
        a = b;
        b = t;*/

        //logic 2 by using + -, without using 3rd variable
        /*a = a + b;
        b = a - b;
        a = a - b;*/

        //logic 3rd multiplication division operator no 3rd variable, variable should not be zero.
        /*a = a * b;
        b = a / b;
        a = a / b;*/

        //logic 4 bitwise xor(*)
        /*a = a ^ b;
        b = a ^ b;
        a = a ^ b;*/

        //logic 5th single statement
        b = a + b - (a = b);
        System.out.println("After swapping values are  "+a+ " "+b);
    }
}
