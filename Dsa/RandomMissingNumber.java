package Dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//you got an integer array filled with 1 to n numbers, but one of the number is missing, Write a program to
// identify the missing number from the given array.
// The numbers are randomly placed,and not sorted. You must do only one traversal.
//solution possible - calculate the sum of the numbers from the array and subtract from array sum of 1 to n numbers.
// You will get the missing number.
public class RandomMissingNumber {
    private int findMissingNumber(Integer[] input){
        int totalArrSum = 0;
        for (int i : input){
            totalArrSum = totalArrSum + i;
        }
        int numberSize = input.length + 1;           // formula for sum of 1 to n number: n*(n+1)/2
        int sumOfNNum = numberSize * (numberSize + 1)/2;
        return  sumOfNNum - totalArrSum;
    }
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        for (int i = 1; i <= 30; i++){
            input.add(i);
        }
        Collections.shuffle(input);
        System.out.println("Removed number: " + input.remove(0));
        Integer[] inputArr = new Integer[input.size()];
        input.toArray(inputArr);

        RandomMissingNumber mnf = new RandomMissingNumber();
        System.out.println("The Missing number is: " + mnf.findMissingNumber(inputArr));
    }
}
