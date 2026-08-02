package FunctionalPrograming;
//change function combine multiple function
import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {
        int increment = incrementByOne();
        System.out.println("Number1: " + increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println("Number2: " +increment2);

       int multiply = multiplyBy10Function.apply(increment2);
        System.out.println("Number3: " +multiply);

        Function <Integer, Integer> addBy1AndThenMultiplyBy10 =
        incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println("Number: " +addBy1AndThenMultiplyBy10.apply(4));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
    static int incrementByOne(){
        return  1 + 1;

    }
}
