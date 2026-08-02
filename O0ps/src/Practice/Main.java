package Practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //List <class name> list name = new ArrayList <> (); basic declaration of array list
    private final List<Employee>employeeList = new ArrayList<>();

    private  void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    private void removeEmployeeById(int id){
        for (Employee employee : employeeList){
            if (employee.getId()==id){
                employeeList.remove(employee);
            }
        }
        System.out.println("Employee deleted of id : " +id);
    }
    private  void showEmployeeList() {
        System.out.println("Employee List");
        for (Employee employee : employeeList) {
            System.out.println("Id: "  +employee.getId() + ",  Name: "  +employee.getName() + ",  Salary: "  +employee.getSalary());
        }
    }
    private  void searchEmployeeByName(String name){
            for (Employee employee : employeeList){
        if (employee.getName().equals(name)){
                System.out.println("Information for," +employee.getName());
                System.out.println(employee.getId()+" "+employee.getSalary());
            }
        }
    }
    private  void showOptions(){
        System.out.println("\n1, Create new employee\n"+
                "2, Print employee List\n"+
                "3, Remove employee List\n"+
                "4, Search employee List\n"+
                "5, Exit");
    }
    private  Employee takeEmployeeInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee Name");
        String name = scan.nextLine();
        System.out.println("Enter employee id");
        int id = scan.nextInt();
        System.out.println("Enter employee Salary");
        int salary = scan.nextInt();


        Employee newEmployee = new Employee(name, id, salary);

        return  newEmployee;
    }



    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            main.showOptions();
            option = scan.nextInt();

            switch (option){
                case 1:
                    //create new employee
                    Employee employee = main.takeEmployeeInput();
                    main.addEmployee(employee);
                    break;
                case 2:
                    //print employee list
                    main.showEmployeeList();
                    break;
                case 3:
                    //Remove employee list
                    System.out.println("Enter employee id to delete");
                    int id = scan.nextInt();
                    main.removeEmployeeById(id);
                    break;
                case 4://Search employee by name
                    System.out.println("Enter employee name to search");
                    String name = scan.next();
                    main.searchEmployeeByName(name);
                    break;
                case 5:
                    // Exit
                    System.exit(1);
                    break;
            }

        }while(option != 5);
    }
}
