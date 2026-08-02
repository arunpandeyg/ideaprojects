package Practice;


import java.util.ArrayList;
import java.util.List;

public class Man {
    //list
    private final List<Employee> employeeList = new ArrayList<>();
    private void addEmployee(Employee employee){

        employeeList.add(employee);
    }
    private void  removeEmployeeById(int id){
        for (Employee employee : employeeList){
            if (employee.getId() ==id){
                employeeList.remove(employee);
            }
        }
        System.out.println("Employee List after removal: ");
        showEmployeeList();
        System.out.println();
    }
    private  void showEmployeeList(){
        for (Employee employee: employeeList){
            System.out.println("Name: "+employee.getName()+",  Id: "+ employee.getId()+",  Salary:  "+   employee.getSalary());
        }
    }
    private  void searchEmployeeByName(String name){

        for (Employee employee : employeeList){

            if (employee.getName().equals(name)){
                System.out.println("Name: "+employee.getName()+",  Id: "+ employee.getId()+",  Salary:  "+   employee.getSalary());

            }
        }
    }
    //private  void removeAllEmployeeFromList(List<Employee> employeeList){}


    public static void main(String[] args) {

        Man man = new Man();

        Employee employee1 = new Employee("Raj", 1, 10000);
        Employee employee2 = new Employee("Shivam", 2, 15000);
        Employee employee3 = new Employee("Rohan", 3, 12000);
        Employee employee4 = new Employee("Ajay", 4, 16000);

        man.addEmployee(employee1);
        man.addEmployee(employee2);
        man.addEmployee(employee3);
        man.addEmployee(employee4);

        man.showEmployeeList();
        System.out.println();

        man.removeEmployeeById(3); //Rohan

        System.out.println("Modified employee List ");
        man.showEmployeeList();
        System.out.println();

        System.out.println("Search results:  ");
        man.searchEmployeeByName("Raj");
        man.searchEmployeeByName("Shivam");


    }

}
