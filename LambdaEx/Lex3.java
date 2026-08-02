package LambdaEx;
//Predicate

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    int experience;

    public Employee(String ename, int salary, int experience) {
        this.ename = ename;
        this.salary = salary;
        this.experience = experience;
    }
}
public class Lex3 {
    public static void main(String[] args) {
        //ex1
        //emp obj --> return name if salary > 30000 exp>3. boolean
        Employee employee = new Employee("John", 50000, 5);

        Predicate<Employee> pr = e -> (e.salary > 30000 && e.experience >3);
        System.out.println(pr.test(employee));
        System.out.println();
        //ex2
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee("John", 50000, 5));
        al.add(new Employee("David", 20000, 2));
        al.add(new Employee("Scott", 30000, 3));
        al.add(new Employee("Raju", 50000, 4));
        al.add(new Employee("Rajesh", 70000, 6));

        for (Employee e : al){
            //if(e.salary>30000 && e.experience>3) can also write this for limited conditions
            if (pr.test(e)){
                System.out.println(e.ename + " " + e.salary + " " + e.experience);
            }
        }
    }
}
