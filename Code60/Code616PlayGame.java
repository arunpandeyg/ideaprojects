package Code60;
//Design and implement an application that plays the Rock Paper Scissors game against the computer.
//The program should randomly choose one of the three options, then prompt the user's selection.
// At that point, the program reveals both choices and prints a statement indicating if the user
// won, the computer won or if it is a tie. Continue playing until user chooses to stop, then
// print the number of wins, loses, and ties.


import java.util.Random;
import java.util.Scanner;



public class Code616PlayGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Game game = new Game();
        char quit = ' ';
        while (quit != 'N'){
            game.play();

            System.out.println("Please, again press any key to continue, or 'N' to quit");
            quit = scan.nextLine().toUpperCase().charAt(0);
        }
        scan.close();
        game.displayStats();
    }
}

class  GameItems{
    public  enum CHOICES{ROCK, PAPER, SCISSORS};
    public  enum RESULT {WIN, LOSE, TIE};
}
class Computer extends GameItems{
    private final Random rand;
    public Computer(){
        super();
        rand = new Random();
    }
    public CHOICES getChoice(){
        int choice = 1 + rand.nextInt(3);
        switch (choice){
            case 1:
                return CHOICES.ROCK;
            case  2:
                return CHOICES.PAPER;
        }
        //case3
        return CHOICES.SCISSORS;
    }
}

class Player extends GameItems{
    Scanner scan;

    public Player(){
        super();
        scan = new Scanner(System.in);
    }
    public GameItems.CHOICES getChoice(){
        System.out.println("Enter your choice: R = ROCK, P = PAPER, S = SCISSORS");
        char playerChoice = scan.nextLine().toUpperCase().charAt(0);

        switch (playerChoice){
            case  'R':
                return GameItems.CHOICES.ROCK;
            case 'P':
                return GameItems.CHOICES.PAPER;
            case  'S':
                return GameItems.CHOICES.SCISSORS;
        }
        //if neither of the above, then it is an invalid input
        System.out.println("Invalid input!");
        return getChoice();
    }
}
class Game extends GameItems{
    private final Player player;
    private final Computer computer;
    private CHOICES playerChoice;
    private CHOICES computerChoice;
    private RESULT result;
    private static int wins;
    private static int loses;
    private static int ties;

    public Game(){
        super();
        player = new Player();
        computer = new Computer();
    }

    public void play(){
        playerChoice = player.getChoice();
        computerChoice = computer.getChoice();
        result = getResults();
        displayResults();
        stats();

    }

    public void displayStats(){
        System.out.println("you have played:  " + (wins + loses + ties) + "  games");
        System.out.println("You have won: " + wins + " times");
        System.out.println("You have lost: " + loses + " times");
        System.out.println("The tie happened " + ties + " times.\nGood Bye");
    }
    private void stats(){
        if (result == RESULT.WIN)
            wins++;
        else if (result == RESULT.LOSE)
            loses++;
        else
            ties++;
    }
    private void displayResults(){
        switch (result){
            case WIN:
                System.out.println(playerChoice + ",  beats " + computerChoice + ", Player WINS");
                break;
            case LOSE:
                System.out.println(playerChoice + ", loses to " + computerChoice + ", Computer WINS");
                break;
            case TIE:
                System.out.println(playerChoice + "Equals to " + computerChoice + ", It's a TIE");
                break;
        }
    }
    private RESULT getResults(){
        if (playerChoice == computerChoice)
            return RESULT.TIE;

        switch (playerChoice){
            case ROCK:
            return (computerChoice == CHOICES.SCISSORS ? RESULT.WIN : RESULT.LOSE);
            case PAPER:
            return (computerChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
            case SCISSORS:
            return (computerChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);
        }
        //IT WILL NEVER COME TO THIS LINE.
        return RESULT.LOSE;
    }
}
