package Streams;
//Stream

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String sname;
    int id;
    char grade;

    public Student(String sname, int id, char grade) {
        this.sname = sname;
        this.id = id;
        this.grade = grade;
    }
}
public class Js11 {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Rajesh",101,'A'));
        studentList1.add(new Student("Suresh",102,'B'));
        studentList1.add(new Student("Naresh",103,'C'));

        List<Student> studentList2 = new ArrayList<>();
        studentList1.add(new Student("Hari",104,'C'));
        studentList1.add(new Student("Dev",105,'B'));
        studentList1.add(new Student("Om",106,'A'));

        List<List<Student>> studentList = Arrays.asList(studentList1, studentList2);
        //before java 8
        for (List<Student> s : studentList){
            for (Student stu : s){
                System.out.println(stu.sname);
            }
        }
        //streams concept flatMap
        //type 1 without method reference
        List<String> nameList = studentList.stream()
                .flatMap(stulist -> stulist.stream())
                .map(s -> s.sname)
                .collect(Collectors.toList());
        System.out.println(nameList);

        //type 2 method reference
        List<String> namList = studentList.stream().flatMap(Collection::stream).map(s -> s.sname).collect(Collectors.toList());
        System.out.println(namList);
    }
}
