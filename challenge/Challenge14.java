package challenge;

public class Challenge14 {    //method constructor calling
    private final int a = 1;
    private void show(){
        System.out.println("Jai Shree Krishna, private method");

    }
    private Challenge14(){
        System.out.println("Today is Rakshabandhan festival, private constructor");
    }

    public static void main(String[] args) {
        Challenge14 ch = new Challenge14();
        System.out.println("Private Method:  " +ch.a);
        ch.show();

    }
}
