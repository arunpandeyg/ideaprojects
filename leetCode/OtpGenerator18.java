package leetCode;
//write a program to generate otp


public class OtpGenerator18 {
    private static int generateOTP(){

        return (int) (Math.random() * 1000000);

    }
    private static int generateOtp(){

        int otp = (int) (Math.random() * 1000000);


        return otp;
    }

    public static void main(String[] args) {

        System.out.println(generateOTP());
        System.out.println(generateOtp());
    }
}
