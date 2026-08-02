package Streams;
//stream filter + map

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Empl{
   int empid;
   String empname;
   int salary;

    public Empl(int empid, String empname, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
}
public class js8 {
    public static void main(String[] args) {
       /* List<Empl> empList = new ArrayList<>();
        empList.add(new Empl(101,"Alex",10000));
        empList.add(new Empl(102,"Alex",10000));
        empList.add(new Empl(101,"Alex",10000));
        empList.add(new Empl(101,"Alex",10000));
        empList.add(new Empl(101,"Alex",10000));*/
        List<Empl> empls = Arrays.asList(
                new Empl(101,"Alex",10000),
                new Empl(102,"Brain",20000),
                new Empl(103,"Charle",30000),
                new Empl(104,"David",40000),
                new Empl(105,"Edward",50000)
        );
        //combination of filter and map
      List<Integer> emplSalList = empls.stream()
              .filter(e -> e.salary > 20000)
              .map(e -> e.salary)
              .collect(Collectors.toList());
        System.out.println(emplSalList);
    }
}
