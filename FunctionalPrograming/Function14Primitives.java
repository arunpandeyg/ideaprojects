package FunctionalPrograming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Function14Primitives {
    public static void main(String[] args) {
        //Function<String, String> upper1CaseName = String::toUpperCase;

       /* Function<String, String> upperCaseName = name-> {
            //logic
            if (name.isBlank()) throw new IllegalArgumentException(" ");
            return name.toUpperCase();
        };*/
        Integer number = null;
        int counter = 0;
        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            //logic
            if (name.isBlank()) throw new IllegalArgumentException(" ");
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(upperCaseName.apply("Alex",20));

    }

}
