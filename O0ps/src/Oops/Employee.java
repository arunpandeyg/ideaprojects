package Oops;


public class Employee {
  int empId;
  String empname;
  int salary;
  int deptno;
  /*Employee(int id, String name, int sal, int dno){
      empId = id;
      empname = name;
      salary = sal;
      deptno = dno;
  }*/
  void setData(int id, String name, int sal, int dno){
      empId = id;
      empname = name;
      salary = sal;
      deptno = dno;
  }
  void display(){
      System.out.println(empId);
      System.out.println(salary);
      System.out.println(deptno);
      System.out.println(deptno);
  }

    public static void main(String[] args) { //  initialising value of variables objects, constructors, methods
      // using constructor
        /*Employee emp1 = new Employee(101, "Raj", 30000, 10);
        emp1.display();
        Employee emp2 = new Employee(102, "Kiran", 20000, 20);
        emp2.display();*/

       /* Employee emp1 = new Employee();  //first emp object
        emp1.empId = 101;
        emp1.empname = "Raj";
        emp1.salary = 30000;
        emp1.deptno = 10;
        emp1.display();

        Employee emp2 = new Employee();    //second emp object
        emp2.empId = 102;
        emp2.empname = "Kiran";
        emp2.salary = 20000;
        emp2.deptno = 20;
        emp2.display(); */


        //using methods
        Employee emp1 = new Employee();
        emp1.setData(101, "Raj", 30000, 10);
        emp1.display();

        Employee emp2 = new Employee();
        emp2.setData(102, "Kiran", 20000, 20);
        emp2.display();
    }



}
