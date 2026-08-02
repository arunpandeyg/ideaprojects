package challenge;

import java.util.HashSet;
import java.util.Set;

public class Challenge25 {      //duplicate with random order , find out the element not duplicated.
    public static void main(String[] args) {
        int[] arr = {4,2,1,1,2,3,4};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length;i++){
            if (!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else {
                set.remove(arr[i]);
            }
        }
        System.out.println("Unique element is: "+set);
    }

}
