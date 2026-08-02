package challenge;



import java.util.ArrayList;
//remove range
public class Challenge18 extends ArrayList<Integer> {
    public static void main(String[] args) {
        Challenge18 arr = new Challenge18();
        for (int i = 1; i <=10; i++) {
            arr.add(i * 10);
        }
        arr.removeRange(2,7);
        System.out.println(arr);
        }

    }

//......................................................................
    class Range extends ArrayList<Integer>{         //remove given range
        public static void main(String[] args) {
            Range r = new Range();
            for (int i = 10; i<= 100; i=i+10){
                r.add(i);
            }
            System.out.println(r);
            r.removeRange(2,7);
            System.out.println(r);
        }
    }

