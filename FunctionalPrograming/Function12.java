package FunctionalPrograming;
//callbacks, like javascript


import java.util.function.Consumer;

public class Function12 {
    public static void main(String[] args) {
          hello("John", "Montana", value -> {
          System.out.println("No last name provided for" +value);
});
          hello2("John", "Montana",
                () -> System.out.println("No last name provided for"));

    }
    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);

        if (lastName != null){
            System.out.println((lastName));
        }else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);

        if (lastName != null){
            System.out.println((lastName));
        }else {
            callback.run();
        }
    }
   /* function hello(firstname, lastName, callback ){
        console.log(firstName);
        if (lastName){
            console.log(lastName)
        }else {
            callback();
        }
    }*/
}
