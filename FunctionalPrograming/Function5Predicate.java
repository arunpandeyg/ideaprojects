package FunctionalPrograming;

import java.util.function.Predicate;

public class Function5Predicate {

    public static void main(String[] args) {

        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("09810000001"));
        System.out.println(isPhoneNumberValid("0981000002"));
        System.out.println(isPhoneNumberValid("098100000031"));

        System.out.println("with Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("09810000001"));
        System.out.println(isPhoneNumberValidPredicate.test("0981000001"));
        System.out.println(isPhoneNumberValidPredicate.test("098100000031"));

        System.out.println(
                "is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("09810000011")); //with and all of them have to be true

        System.out.println(
                "is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("09810000013")); //with or, only one condition need to be true
                                                                                                 //with and both conditions need to be true
    }
    static boolean isPhoneNumberValid(String phoneNumber){
        return  phoneNumber.startsWith("098") && phoneNumber.length() == 11;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("098") && phoneNumber.length() == 11;
    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
