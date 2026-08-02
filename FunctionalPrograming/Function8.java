package FunctionalPrograming;

import java.util.List;
import java.util.function.Predicate;

import static FunctionalPrograming.FP.Gender.FEMALE;
import static FunctionalPrograming.FP.Gender.MALE;

//Streams
public class Function8 {
    public static void main(String[] args) {
        List<FP.Person> people = List.of(
                new FP.Person("johan", MALE),
                new FP.Person("Maria", FEMALE),
                new FP.Person("Aisha", FEMALE),
                new FP.Person("Alex", MALE),
                new FP.Person("Alice", FEMALE));
               //new FP.Person("Bob", PREFER_NOT_TO_SAY);



        /*people.stream()
                .map(person -> person.name)                 //by name will print name , by gender will print gender,
                .mapToInt(String::length)                   // this will print length of letters is a name
                //.collect(Collectors.toSet())
                .forEach(System.out::println);*/

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
                //.allMatch(person -> FEMALE.equals(person.gender));
                //.anyMatch(person -> FEMALE.equals(person.gender));  //same action can be done with, prefer not to say, also.
                .noneMatch(person -> FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemales);




    }
}

class Person{
    private final String name;
    final FP.Gender gender;

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

