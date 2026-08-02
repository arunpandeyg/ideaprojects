package FunctionalPrograming;

//imperative programing

import java.util.ArrayList;
import java.util.List;

import static FunctionalPrograming.FP.Gender.FEMALE;
import static FunctionalPrograming.FP.Gender.MALE;

public class FP {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("johan", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE));

        System.out.println("\t//imperative approach");
        //imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("\t//Declarative approach");
        //declarative approach

        List<Person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender)).toList();
        //collect(Collectors.toList()) , changed in above line
                females2.forEach(System.out::println);
    }

    static class Person{
        final String name;
        final Gender gender;

        public Person(String name, Gender gender) {
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
    enum Gender {
        MALE, FEMALE;


    }
}

