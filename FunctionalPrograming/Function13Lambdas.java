package FunctionalPrograming;
//lambdas


import java.util.function.BiFunction;
import java.util.function.Function;

public class Function13Lambdas {
    public static void main(String[] args) {
        Function<String, String> upperrCaseName = String::toUpperCase;

        Function<String, String> upperCaseName = name-> {
            //logic
            if (name.isBlank()) throw new IllegalArgumentException(" ");
            return name.toUpperCase();
        };
        BiFunction<String, Integer, String> _upperCaseName = (name, age) -> {
            //logic
            if (name.isBlank()) throw new IllegalArgumentException(" ");
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(upperCaseName.apply("Alex"));

    }
}
