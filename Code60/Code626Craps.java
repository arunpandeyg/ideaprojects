package Code60;
//game of craps
//Roll 2 dice the sum of the dice is calculated.

import java.util.Arrays;
import java.util.Random;

public class Code626Craps {
    public static void main(String[] args) {
        CrapsGame crapsGame = new CrapsGame();
        crapsGame.play();
    }
}
class Statistics{
      public static int[] wins =new int[22];
      public static int[] loses = new int[22];

      public double averageLength(){
          double avg;
          int sumOfRounds = 0;
          for (int i = 1; i <= 21; i++){
              sumOfRounds += (wins[i] * i) + (loses[i] * i);
          }
          avg = (double) sumOfRounds / (Arrays.stream(wins).sum() + Arrays.stream(loses).sum());
          return avg;
      }

      public void setStats(int round, CrapsGame.GameStatus result){
          if (result == CrapsGame.GameStatus.WIN){
              if (round <= 20){
                  wins[round] += 1;
              }
              else {
                  wins[21] += 1;
              }
          }
          else if (result == CrapsGame.GameStatus.LOSE){
              if (round <= 20){
                  loses[round] += 1;
              }
              else {
                  loses[21] += 1;
              }
          }
      }
      public double probabilityOfWinning(){
          return (double) Arrays.stream(wins).sum() / (Arrays.stream(wins).sum() + Arrays.stream(loses).sum());
      }
      public void displayStatistics(){
          double probability;
          double avg;
          for (int i = 1; i <= 21; i ++){
              if (i == 21){
                  System.out.println("Round 21 or more wins: " + wins[i]);
              }
              else
                  System.out.println("Round " + i + " wins: " + wins[i]);
          }
          for (int i = 1; i <= 21; i ++){
              if (i == 21){
                  System.out.println("Round 21 or more loses: " + loses[i]);
              }
              else
                  System.out.println("Round " + i + " loses: " + loses[i]);
          }
          probability = probabilityOfWinning();
          System.out.println("Chances of winning the game of Craps are " + probability * 100 + "%");
          System.out.println("Average length of a game of Craps is " +averageLength() + " rounds");
      }
}
class CrapsGame{
    private enum DiceSum{
        SNAKE_EYES (2),
        TREY (3),
        SEVEN (7),
        YO_LEVEN (11),
        BOX_CARS (12);
        private  int value;
        private DiceSum(int value){
            this.value = value;
        }
    };
    public enum GameStatus{
        WIN,
        LOSE,
        CONTINUE
    };
    private final RollDice roll;
    private GameStatus gameStatus;
    private DiceSum diceSum;
    private int numRolls;
    private int sum;
    private int point;
    public final static int NUM_GAMES = 5;
    private final Statistics statistics;

    public CrapsGame(){
        roll = new RollDice();
        statistics = new Statistics();
    }
    public void play(){
        for (int i = 0; i < NUM_GAMES; i++){
            System.out.println("************************************** game #" + (i + 1));
            gameStatus = GameStatus.CONTINUE;
            numRolls = 0;

            sum = roll.diceRoll();
            numRolls++;
            evaluateRoll();
            displayMessage();
            while (gameStatus == GameStatus.CONTINUE){
                keepPlaying();
                displayMessage();
           }

        }
        statistics.displayStatistics();;
    }
    private void keepPlaying(){
        sum = roll.diceRoll();
        numRolls++;

        if (sum == point){
            gameStatus = GameStatus.WIN;
            statistics.setStats(numRolls, gameStatus);
        }
        else if (sum == 7){
            gameStatus = GameStatus.LOSE;
            statistics.setStats(numRolls, gameStatus);
        }
        else
            gameStatus = GameStatus.CONTINUE;
    }

    private void displayMessage(){
        switch (gameStatus){
            case WIN:
                System.out.println(numRolls == 1
                        ?"Congratulations, you rolled "+diceSum+" You WIN!"
                        :"Congratulations, you rolled "+sum+" You WIN!");
            break;
            case LOSE:
                System.out.println(numRolls == 1
                        ?"Sorry, you rolled "+diceSum+ " You Lose!"
                        :"Sorry, you rolled "+sum+ " You Lose!");
            break;
            default:
                System.out.println("You rolled "+sum+" your point is "+point+" keep rolling!");
            break;

        }
    }

    private void evaluateRoll(){
        switch (sum){
            case 7:
                diceSum = DiceSum.SEVEN;
                gameStatus = GameStatus.WIN;
                point = 0;
                statistics.setStats(numRolls, gameStatus);
                break;
            case 11:
                diceSum = DiceSum.YO_LEVEN;
                gameStatus = GameStatus.WIN;
                point = 0;
                statistics.setStats(numRolls, gameStatus);
                break;
            case 2:
                diceSum = DiceSum.SNAKE_EYES;
                gameStatus = GameStatus.LOSE;
                point = 0;
                statistics.setStats(numRolls, gameStatus);
                break;
            case 3:
                diceSum = DiceSum.TREY;
                gameStatus = GameStatus.LOSE;
                point = 0;
                statistics.setStats(numRolls, gameStatus);
                break;
            case 12:
                diceSum = DiceSum.BOX_CARS;
                gameStatus = GameStatus.LOSE;
                point = 0;
                statistics.setStats(numRolls, gameStatus);
                break;
            default:
                gameStatus = GameStatus.CONTINUE;
                point = sum;
                break;

        }
    }

}
class RollDice{
    private final Random rand = new Random();
    private int die1;
    private int die2;

    public int diceRoll(){
        die1 = rand.nextInt(6 + 1);
        die2 = rand.nextInt(6 + 1);
        return die1 + die2;

    }
}
