package Code60;

import java.util.Scanner;

//driver License test evaluation
//'B', 'D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C,'B','D','A'
public class Code618DL {
    public static void main(String[] args) {
        final int SIZE = 20;
                char [] correctAnswers = {
                        'B', 'D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
                char singleAnswer = ' ';
        Scanner scan = new Scanner(System.in);

        char [] incorrectAnswers = new char[SIZE];
        int wrongAnswersCounter = 0;
        boolean wrongAnswer;

        for (int i = 0; i < SIZE; i++) {

            do {
                wrongAnswer = false;
                System.out.println("Please enter your answer to question #" + (i + 1) + ": ");
                singleAnswer = scan.nextLine().toUpperCase().charAt(0);

                if (singleAnswer != 'A' && singleAnswer != 'B' && singleAnswer != 'C' &&
                        singleAnswer != 'D') {
                    System.out.print("invalid Input please re-enter your answer. \n");
                    wrongAnswer = true;
                }

        }while (wrongAnswer);

            if (correctAnswers[i] != singleAnswer){
                incorrectAnswers[i] = singleAnswer;
                wrongAnswersCounter++;
            }
        }
         scan.close();

        System.out.println(
                wrongAnswersCounter >= 5 ? "Sorry you have failed. " : "Congratulations, " +
                        "you have passed.");
        System.out.println("You have answered: " + (SIZE - wrongAnswersCounter) + " Correctly and: "
                + wrongAnswersCounter + " Incorrectly. ");

        for (int i = 0; i < SIZE; i++){
            if (incorrectAnswers[i] != '\u0000'){
                System.out.println("You answered question #" + (i + 1) + " Incorrectly, your answer was: "
                        +incorrectAnswers[i] + ", Correct answer is " + correctAnswers[i] + ", ");
            }
        }
    }
}
