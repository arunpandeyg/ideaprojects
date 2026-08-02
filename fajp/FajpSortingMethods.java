package fajp;
//sorting elements in Array using built in methods.


import java.util.Arrays;
import java.util.Collections;

public class FajpSortingMethods {
    public static void main(String[] args) {
        //approach 1
        /*int [] a = {30,50,20,10,60};
        System.out.println("Array elements before sorting1: " + Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Array elements after sorting1: "+Arrays.toString(a));

        //approach 2
        System.out.println("Array elements before sorting2: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array elements after sorting2: "+Arrays.toString(a)); */

        //reverse or descending order
        Integer  [] a = {30,50,20,10,60}; //Collection.reverseOrder not support primitive data type
        System.out.println("Array elements before sorting3: " + Arrays.toString(a));

        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("Array elements after sorting3: "+Arrays.toString(a));
    }
}
