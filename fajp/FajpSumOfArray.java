package fajp;
//sum  of elements in an array
public class FajpSumOfArray {
    public static void main(String[] args) {
        int []a = {5,2,7,9,6};
        int sum = 0;
        /*for (int i = 0; i < 5; i++){    //or i<=4 or i <= a.length - 1, its = 4.
            sum = sum + a[i];

        }
        System.out.println("The sum of the array:  " + sum); */
        for (int n : a){
            sum = sum + n;
        }
        System.out.println("The Sum of the array elements:  " + sum);
    }
}
