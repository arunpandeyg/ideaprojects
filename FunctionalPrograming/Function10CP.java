package FunctionalPrograming;

import java.time.LocalDate;
import java.time.Period;

//Combinator pattern
public class Function10CP {
    public static void main(String[] args) {
        Customer1 customer = new Customer1(
                "Alice",
                "alice@gmail.com",
                "+091878787878",
                LocalDate.of(2000,1,1)
        );
        System.out.println(new CustomerValidatorService().isValid(customer));
        //if valid we can store customer in DB.
    }
}

 class CustomerValidatorService{
    private boolean isEmailValid(String email){
        return email.contains("@");
    }
    private boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+0");
    }
    private boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() >16;
    }
    public boolean isValid(Customer1 customer){
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNumber())&&
        isAdult(customer.getDob());
    }


}
class Customer1{
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dob;

    public Customer1(String name, String email, String phoneNumber, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }
}
