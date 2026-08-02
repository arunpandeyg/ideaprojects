package Practice;





public class A {
    public static int getSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Main Method: ");
         int result = getSum(5,9);
        System.out.println("Sum of the given Values: " + result);
    }
}
