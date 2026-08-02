package Code60;
//fizz buzz

public class Code621FizzBuzz {
    public static void main(String[] args) {
        System.out.println("For loop solution");

        String text;
        for (int i = 1; i <= 100; i++){     //backward int i = 100; i >= 1; i--;
    if (i % 15 == 0)
        text = "Fizz Buzz";
    else if (i % 3 == 0)
        text = "Fuzz";
    else if (i % 5 == 0)
        text = "Buzz";
    else
        text = Integer.toString(i);

            System.out.println(text);
        }
    }
}
