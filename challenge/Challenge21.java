package challenge;

import java.util.Scanner;

public class Challenge21{          //find out larger element.
    public static void main(String[] args) {
        int[] n = new int[]{60,20,80,40,50};
        int index = n[0];
        for (int i = 1; i < n.length; i++){
            if (index > n[i]){
                continue;
            }
            else {
                index =n[i];
            }
        } //for
        System.out.println(index);
    }

}
class Ch21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        System.out.println("Enter Array elements");
        int[] a = new int[10];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int large = a[0];
        for (int i = 0; i<n; i++){
            if (large<a[i]){
                large=a[i];
            }
        }
        System.out.println("Large, " +large);
    }
}
