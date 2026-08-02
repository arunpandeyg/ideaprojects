package LambdaEx;
//Consumer


import java.util.function.Consumer;

public class Lex8Consumer {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Welcome");
    }
}
