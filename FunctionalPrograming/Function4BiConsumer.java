package FunctionalPrograming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Function4BiConsumer {
    public static void main(String[] args) {
        //Normal java function
        Customer maria = new Customer("Maria", "9810000001");
        greetCustomer(maria);
        greetCustomerV2(maria, true);


        //Consumer functional interface
        greetCustomerConsumer.accept(maria);

        greetCustomerConsumerV2.accept(maria, true);  //on false hide the phone number

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello V2 " + customer.customerName +
                    ",Thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "**********"));
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello V0 " + customer.customerName +
                    ",Thanks for registering phone number "
                    + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello V1 " + customer.customerName +
                ",Thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello V3 " + customer.customerName +
                ",Thanks for registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "**********"));
    }

    record Customer(String customerName, String customerPhoneNumber) {
    }
}
