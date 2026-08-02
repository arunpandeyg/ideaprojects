package Streams;
//streams parallel streams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student1{
    String name;
    int score;

    public Student1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
}
public class Js20 {
    public static void main(String[] args) {
        List<Student1> student1List = Arrays.asList(
                new Student1("David", 82),
                new Student1("Rajesh", 85),
                new Student1("Ramesh", 89),
                new Student1("Rohit ", 90),
                new Student1("Ram   ", 90),
                new Student1("Vijay ", 65),
                new Student1("Ajay  ", 60),
                new Student1("Alok  ", 55));   //List.of()
        System.out.println("Stream");
        student1List.stream().filter(s -> s.getScore() >= 80)   //using stream sequential
                .limit(3).forEach(stu -> System.out.println(stu.getName()+ " " +stu.getScore()));

        //parallel stream
        System.out.println("Parallel stream");
        student1List.parallelStream().filter(s -> s.getScore() >= 80)   //using stream sequential
                .limit(3).forEach(stu -> System.out.println(stu.getName()+ " " +stu.getScore()));

        //convert stream() into parallelStream()
        //parallel()
        System.out.println("converted into parallel Stream");
        student1List.stream().parallel().filter(s -> s.getScore() >= 80)   //using stream sequential
                .limit(3).forEach(stu -> System.out.println(stu.getName()+ " " +stu.getScore()));
    }
}
