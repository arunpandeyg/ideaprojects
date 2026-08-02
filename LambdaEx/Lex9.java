package LambdaEx;
//consumer

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Emp{
    String ename;
    int salary;
    String gender;

    public Emp(String ename, int salary, String gender) {
        this.ename = ename;
        this.salary = salary;
        this.gender = gender;
    }
}
public class Lex9 {
    public static void main(String[] args) {
        ArrayList<Emp> emplist = new ArrayList<Emp>();
        emplist.add(new Emp("Rajesh",30000,"Male"));
        emplist.add(new Emp("Ramesh",40000,"Male"));
        emplist.add(new Emp("Rakesh",50000,"Male"));
        emplist.add(new Emp("Ravina",60000,"Female"));

        //function
        Function<Emp, Integer> f = emp -> (emp.salary * 10 )/ 100; //task 1.
        //predicate
        Predicate<Integer> p = b ->b >=  5000;  //task 2
        //consumer
        Consumer<Emp> c = emp -> {              //task 3
            System.out.println("Employee Name:   "+ emp.ename);
            System.out.println("Employee Salary: " +emp.salary);
            System.out.println("Employee Gender: " +emp.gender);
        };
        for (Emp e : emplist){
            int bonus = f.apply(e);
           if (p.test(bonus)){
               c.accept(e);
                System.out.println("Employee Bonus: "+ bonus);
            }
        }
    }
}
