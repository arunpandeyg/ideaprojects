package FunctionalPrograming;
//functional interface


import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne();
        System.out.println("Number1: " + increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println("Number2: " +increment2);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static int incrementByOne(){
        return  1 + 1;

    }

}
