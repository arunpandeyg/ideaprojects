package FunctionalPrograming;
//bi functions, it takes 2 input and produces 1 result.

import java.util.function.BiFunction;
import java.util.function.Function;

public class Function2 {
    public static void main(String[] args) {
        //function example takes 1 argument and produces 1 result
        int increment = incrementByOne();
        System.out.println("Number1: " + increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println("Number2: " +increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println("Number3: " +multiply);

        Function <Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println("Number: " +addBy1AndThenMultiplyBy10.apply(4));

        //Bifunction takes 2 argument and produces 1 result
        System.out.println("Number5: " +incrementByOneAndMultiply(4,100));

        System.out.println("Number5: " +incrementByOneAndMultiplyBiFunction.apply(4,100));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
    static int incrementByOne(){
        return  1 + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return(number + 1) * numToMultiplyBy;

    }
}
