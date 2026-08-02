package fajp;
//missing number in an Array.

//1.Array should not have duplicates,2. Array no need to be sorted order.3. Values should be in range.
public class FajpMissingNumberArray {
    public static void main(String[] args) {
    int [] a = {1,2,3,5,6};
    int sum1 = 0;
    for (int i = 0; i <a.length; i++){
        sum1 = sum1 + a[i];
    }
        System.out.println("Sum of elements in array: "+sum1);
    int sum2 = 0;
    for (int i = 1; i <= 6; i++){
        sum2 = sum2 + i;

    }
        System.out.println("Sum of the range of elements in an array: "+sum2);
        System.out.println("Missing elements/Number in  array: "+(sum2 - sum1));
    }

}
