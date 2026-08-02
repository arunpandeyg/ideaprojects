package Dsa;
//find out majority elements in a given array.


public class MajorityElement {
    public int majorityElement(int[] nums){
       int count = 0;
       int element = 0;
       for (int n : nums){
           if (count == 0) element = n;
           if (element == n){
               count++;
           }else {
               count--;
           }
       }
       return element;
    }

    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        System.out.println("Majority element : " + me.majorityElement(new int[]{3,2,3}));
        System.out.println("Majority element : " + me.majorityElement(new int[]{2,2,1,1,1,2,2}));
        System.out.println("Majority element : " + me.majorityElement(new int[]{3,3,4,2,4,4,2,4,4}));

    }
}
