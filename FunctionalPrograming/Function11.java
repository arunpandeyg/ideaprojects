package FunctionalPrograming;
//implementing combinator pattern.


import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static FunctionalPrograming.CustomerRegistrationValidator.*;
import static FunctionalPrograming.CustomerRegistrationValidator.ValidationResult.*;

public class Function11 {
    public static void main(String[] args) {
        CustomerF customer = new CustomerF(
                "Alice",
                "alice@gmail.com",
                "+091878787878",
                LocalDate.of(2000,1,1)
        );
       // System.out.println(new CustomerValidatorServiceF().isValid(customer));
        //if valid we can store customer in DB.
        //using combinator pattern

        ValidationResult result = isEmailValid(customer)
                .and(isPhoneNumberValid(customer))
                .and(isAnAdult())
                .apply(customer);
        System.out.println(result);

        if (result != SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}

class CustomerValidatorServiceF{
    private boolean isEmailValid(String email){
        return email.contains("@");
    }
    private boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+0");
    }
    private boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() >16;
    }
    public boolean isValid(CustomerF customer){
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNumber())&&
                isAdult(customer.getDob());
    }

}

interface CustomerRegistrationValidator
        extends Function<CustomerF, CustomerRegistrationValidator.ValidationResult> {

    static CustomerRegistrationValidator isEmailValid (CustomerF customer){
        return CustomerF -> customer.getEmail().contains("@") ?
                SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }
    static CustomerRegistrationValidator isPhoneNumberValid (CustomerF customer){
        return CustomerF -> customer.getPhoneNumber().startsWith("+0") ?
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }
   static CustomerRegistrationValidator isAnAdult(){
        return customerF -> Period.between(customerF.getDob(),LocalDate.now()).getYears() > 16 ?
                SUCCESS : IS_NOT_AN_ADULT;
   }

   default CustomerRegistrationValidator and (CustomerRegistrationValidator other){
        return customerF -> {
            ValidationResult result = this.apply(customerF);
           return result.equals(SUCCESS) ? other.apply(customerF) : result;
        };
   }
    enum ValidationResult{
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}

class CustomerF{
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dob;

    public CustomerF(String name, String email, String phoneNumber, LocalDate dob) {
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


