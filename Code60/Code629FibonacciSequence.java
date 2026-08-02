package Code60;
//Fibonacci Sequence = sum of two preceding numbers
//1 loop solution

public class Code629FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("Fibonacci Loop solution");
        int number1 = 0;
        int number2 = 1;

        System.out.print(number1+ " ");
        System.out.print(number2 +" ");

        for (int i = 0; i <= 15; i++){
            int next = number1 + number2;
            number1 = number2;
            number2 = next;
            System.out.print(next +" ");
        }
    }

}
