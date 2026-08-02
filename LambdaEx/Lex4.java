package LambdaEx;

import java.util.function.Predicate;

//join multiple predicates (and or negate)
//one predicate will check number is even or not, second will check number is > 50 or not.
public class Lex4 {
    public static void main(String[] args) {
        int[] a = {5,10,15,20,25,30,35,40,45,50,55,60,65};
        Predicate<Integer> p1 = i -> i % 2 ==0;   //even number i = integer
        Predicate<Integer> p2 = i -> i > 50;      //>50

        //and
        System.out.println("Following are numbers EVEN and Greater the 50:  ");
        for (int n : a){
           /* if (p1.test(n) && p2.test(n)){ //normal logic
                System.out.println(n);
            }*/
          /*if (p1.and(p2).test(n)) {          //and() method.
              System.out.println("And "+ n);
          }*/
          //or  either condition first one or second one should match.
            /*if (p1.or(p2).test(n)) {          //and() method. this printing even or > 50
                System.out.println("Or "+ n);
            }*/
            if (p1.negate().test(n)) {          //negate() method. this printing odd numbers it reverses the condition
                System.out.println("Negate "+ n);
            }
        }
    }
}
