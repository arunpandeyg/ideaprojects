package LambdaEx;
//supplier


import java.util.Date;
import java.util.function.Supplier;

public class Lex11Supplier {
    public static void main(String[] args) {
        //Supplier<Date> s = ()-> new Date();
        Supplier<Date> s = Date::new;

        System.out.println(s.get());
    }
}
