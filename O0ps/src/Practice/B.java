package Practice;

public class B {
    public static int getSum(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) { // if we pass value in a called method then we do not have to write int j= and int k =,
        //System.out.println("Main Method: ");
        int j = 15;
        int k = 25;
        int result = getSum(j, k);    // we directly pass values to the method in declared identifier will receive and provide results
        System.out.println("Sum of the given Values: " + result);
    }
}
