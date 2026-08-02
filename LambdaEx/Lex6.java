package LambdaEx;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

//Function
class Employee1{
    String ename;
    int salary;


    public Employee1(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }
}


public class Lex6 {
    public static void main(String[] args) {
        ArrayList<Employee1> emplist = new ArrayList<>();

        emplist.add(new Employee1("Ashok",50000));
        emplist.add(new Employee1("Jai   ",40000));
        emplist.add(new Employee1("Rajesh",35000));

        Function<Employee1, Integer> fn = e -> {
            int sal = e.salary;
            if (sal >= 10000 && sal <= 20000)
                return (sal * 10/100);
                else if (sal > 20000 && sal <= 30000)
                    return (sal * 20 / 100);
                    else if (sal > 30000 && sal <= 50000)
                        return (sal * 30 /100);
                        else
                            return (sal * 40 /100);
        };

        Predicate<Integer> p = b -> b > 5000;  //predicate
        for (Employee1 emp : emplist){
            int bonus = fn.apply(emp);  //function
            p.test(bonus);   //predicate
            System.out.println("Employee1 "+emp.ename+ " " +emp.salary);
            System.out.println("Employee1 Bonus: "+bonus);

        }
    }
}
