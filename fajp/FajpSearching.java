package fajp;
//searching an element is an array
//binary search, first short the search.

import java.util.Arrays;

public class FajpSearching {

    public static void main(String[] args) {
    int [] a = {1,2,3,4,5,6,7,8,9,10};   //should be in shorted order
        //approach 1 our own logic
    /*boolean flag = false;
    int key = 5;
    int l = 0;
    int h = a.length - 1;

    while (true){   //also can use (l<=h)
        int m = (l + h)/2;
        if (a [m] == key){
            System.out.println("Element found: ");
            flag = true;
            break;
        }
        if (a [m] < key){
            l = m + 1;
        }
        if (a [m] > key){
            h = m - 1;
        }
    }
        if (flag ==false){   //flag == false also can pass in
            System.out.println("Binary Search - Element not found: ");
        } */
        //approach 2 Arrays.binary search, array should be shorted, if not short first then apply search
        System.out.println("Binary element found:  " +Arrays.binarySearch(a, 8));

    }

}
