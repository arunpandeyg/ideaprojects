package challenge;
//removing elements from Array list

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge20 {
    public static void main(String[] args) {
        int ind = 0;
        ArrayList<String> rem = new ArrayList<String>();
        rem.add("10");
        rem.add("2");
        rem.add("20");
        rem.add("2");
        rem.add("30");
        rem.add("2");
        ind = rem.size();
        System.out.println(rem);

        rem.remove(ind-1);
        System.out.println(rem);

        rem.remove("2");
        System.out.println(rem);
    }
}
//..................................
 class asd{
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(10);
        arr.add(10);
        arr .add(2);
        arr.add(20);
        arr.add(2);
        arr.add(30);
        arr.add(2);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        Integer a = 2;
        arr.remove(a);
        System.out.println(arr);
    }
}
//.....................................
class Ddd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        System.out.println("Enter input elements");
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i <=5; i++){
            l.add(sc.nextInt());
        }
        System.out.println("The inputs are: ");
        for (Integer I : l){
            System.out.println(I+" ");

        }
        l.remove(4);
        System.out.print(l+" ");
        l.remove(2);
        System.out.println();
        for (int I :l) {

            System.out.print(I+" ");
        }
    }
}
