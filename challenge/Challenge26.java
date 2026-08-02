package challenge;

import java.util.HashSet;
import java.util.Set;

public class Challenge26 {      //find the enter section of 2 arrays
    public static void main(String[] args) {
        int[] a = {11,23,45,76,86,39};
        int[] b = {13,23,49,76,98,42};


        Set<Integer> setA = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i< a.length; i++){
            setA.add(a[i]);
        }
        for (int j=0; j<b.length; j++){
            if (setA.contains(b[j])){
                result.add(b[j]);
            }
        }
        System.out.println(result);
    }

}
