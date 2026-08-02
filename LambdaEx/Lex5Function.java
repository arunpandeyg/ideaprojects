package LambdaEx;
//function


import java.util.function.Function;

public class Lex5Function {
    public static void main(String[] args) {
        Function<Integer, Integer> f = n -> n * n;
        System.out.println(f.apply(5));

        //String length
        Function<String,Integer> fn = s -> s.length();
        System.out.println(fn.apply("Welcome"));
    }
}
