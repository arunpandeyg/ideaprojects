package FunctionalPrograming;
//optionals


import java.util.Optional;
import java.util.function.Supplier;

public class Function9 {
    public static void main(String[] args) {
        //Supplier<IllegalStateException> exception = () -> new IllegalStateException("exception");

        Optional.ofNullable(null)       // if i add a value here in braces hello,or anything will be printed on console
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " +email),
                        () -> System.out.println("Cannot send email "));
                //.ifPresent(email -> System.out.println("Sending email to " +email));

                //.orElseThrow(() -> new IllegalStateException("Exception"));
                //.orElseGet(()-> "Default value");
                //System.out.println(value);
    }
}
