package fajp;
//how to find maximum and minimum element in an array
public class FajpMaxMinElementArray {
    public static void main(String[] args) {
        int [] a = {50, 30, 40, 20, 60};

        //maximum value
        int max = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Maximum number is: " + max);
        //minimum value
        int min = a[0];
        for (int i = 1; i < a.length; i++){
            if  (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum number is: " + min);
    }
}
