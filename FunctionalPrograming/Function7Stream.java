package FunctionalPrograming;
//streams


import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static FunctionalPrograming.FP.Gender.FEMALE;
import static FunctionalPrograming.FP.Gender.MALE;
import static FunctionalPrograming.Function7Stream.Gender.PREFER_NOT_TO_SAY;


public class Function7Stream {
    public static void main(String[] args) {
        List<FP.Person> people = List.of(
                new FP.Person("johan", MALE),
                new FP.Person("Maria", FEMALE),
                new FP.Person("Aisha", FEMALE),
                new FP.Person("Alex", MALE),
                new FP.Person("Alice", FEMALE));
                //new FP.Person("Bob", PREFER_NOT_TO_SAY);


        /*Function<Person,String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;*/

     people.stream()
                .map(person -> person.name)                 //by name will print name , by gender will print gender,
                .mapToInt(String::length)                   // this will print length of letters is a name
                //.collect(Collectors.toSet())
                .forEach(System.out::println);
    }


    static class Person{
        private final String name;
        private final FP.Gender gender;

        public Person(String name, FP.Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "person{" +
                    "name= '" + name + '\'' +
                    ", gender= " + gender +
                    '}';
        }
    }
    enum Gender{
        MALE, FEMALE, PREFER_NOT_TO_SAY;
    }
}

