package LambdaEx;
//predicate method test();
//returns true and false boolean, use when you want to conditional check.

import java.util.function.Predicate;

public class Lex2 {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> (i > 10);
        System.out.println(p.test(20));
        System.out.println(p.test(5));

        //ex2 check the length of a given string
        Predicate<String> pr = s -> (s.length() >4);
        System.out.println( pr.test("Welcome"));
        System.out.println( pr.test("xyz"));

        //ex3
       String [] names = {"David", "Scott", "Smith","John","Mary"};
       for (String name : names){
           if (pr.test(name)){
               System.out.println(name);
           }

           //direct length method
           if (name.length()>4){
               System.out.println("direct: "+ name);
           }
       }
    }
}
