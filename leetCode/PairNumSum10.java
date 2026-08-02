package leetCode;
//find pairs in an integer array making sum 10 in one single traversal. array integer range 1 - 9,
//number= min is 1 and max is 9, numbers are randomly paced not sorted, duplicate numbers are allowed.


import java.util.HashSet;
import java.util.Set;

public class PairNumSum10 {
    public static void main(String[] args) {
        int[] first = {9,5,6,7,3,4,5,1,3,6,7,4,2,8};
        PairNumSum10 pns = new PairNumSum10();
        pns.findPair(first);
    }
    private void findPair(int[] input){
        Set<Integer> tempStore = new HashSet<>();
        for (int i : input){
            if (tempStore.contains(i)){
                System.out.println(i + ",  " + (10 - i));
            }
            else {
                tempStore.add(10 - i);
            }
        }
    }

}

class PairNmSum10 {                                          //my type 1
    public static void main(String[] args) {

        int[] first = {9, 5, 6, 7, 3, 4, 5, 1, 3, 6, 7, 4, 2, 8};

        Set<Integer> tempStore = new HashSet<>();
        for (int i : first) {
            if (tempStore.contains(i)) {
                System.out.println(i + ",  " + (10 - i));
            } else {
                tempStore.add(10 - i);
            }
        }

    }
}
class PairNumSm10 {                            //my type 2
    public static void main(String[] args) {
        int[] first = {9,5,6,7,3,4,5,1,3,6,7,4,2,8};

        findPair(first);
    }
    public static void findPair(int[] input){
        Set<Integer> tempStore = new HashSet<>();
        for (int i : input){
            if (tempStore.contains(i)){
                System.out.println(i + ",  " + (10 - i));
            }
            else {
                tempStore.add(10 - i);
            }
        }
    }

}
