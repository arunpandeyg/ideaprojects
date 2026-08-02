package FunctionalPrograming;


import java.util.Collection;
import java.util.function.Consumer;

public class Function3Consumer {
    public static void main(String[] args) {
        //Normal java function
        Customer maria = new Customer("Maria","9810000001");
       greetCustomer(maria);

        greetCustomer(maria);
       
       //Consumer functional interface
       greetCustomerConsumer.accept(maria);

    }
   static Consumer<Customer>  greetCustomerConsumer = customer ->
           System.out.println("Hello " + customer.customerName +
                   ",Thanks for registering phone number "
                   +customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName +
                ",Thanks for registering phone number "
                +customer.customerPhoneNumber);
    }
}
 class Customer{
    final String customerName;
    final String customerPhoneNumber;

     Customer(String customerName, String customerPhoneNumber) {
         this.customerName = customerName;
         this.customerPhoneNumber = customerPhoneNumber;
     }



 }

