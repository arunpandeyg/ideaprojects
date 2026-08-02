package Code60;
//Tortoise vs Hare


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Code624TH {
    public static void main(String[] args) {
        Race race = new Race();
        race.racing();
    }
}
class Pavol extends Runner{
    public Pavol(int currentPosition, int lane, String name){
        this.currentPosition = currentPosition;
        this.lane = lane;
        this.name = name;
        runnerSymbol = "P";

        moveDescription = name + " is READY! SET! GO!";
        allRunners.add(this);
    }

    @Override
    public void calculateMove() {
        int move = getMoveType();

        if (move >= 1 && move <= 50){
            makeMove(MoveType.PAVOL_JUMPS);
            moveDescription = name + " made Povel jump  (+5)";
        }
        else if (move >= 51 && move <= 70){
            makeMove(MoveType.SLIP);
            moveDescription = name + " Slipped (-6)";
        }
        else {
            makeMove(MoveType.SLOW_PLOD);
            moveDescription = name + " moved Slow Plod (+1)";
        }
    }
}

class Race{
    private final Track track;
    private boolean raceOver;
    public Race(){
        track = new Track();
        new Tortoise(0,0," Tortoise ");
        new Hare(0,1, " Hare ");
        new Pavol(0,2, "Pavol");
        raceOver = false;
    }
    public void racing(){
        setUpRace();
        do {
            Scanner s = new Scanner(System.in);
            s.nextLine();

            for (Runner runner : Runner.allRunners){
                runner.calculateMove();
                track.runnerPosition(runner);
                System.out.println(runner.moveDescription);

                if (runner.isWinner(runner)){
                    raceOver = true;
                }
            }
            track.displayRaceTrack();


        }while (!raceOver);

        getPlace();
    }
    public void getPlace(){
        for (Runner runner : Runner.allRunners){
            if (runner.currentPosition == Track.TRACK_LENGTH){
                System.out.println("The winner(s) is: " + runner.name);
            }
        }
    }
    private void setUpRace(){
        for (Runner runner : Runner.allRunners){
            track.runnerPosition(runner);
            System.out.println(runner.moveDescription);
        }
        track.displayRaceTrack();
    }
}
final class MoveType{
    public static final int FAST_PLOD = 3;
    public static final int SLIP = -6;
    public static final int SLOW_PLOD = 1;
    public static final int SLEEP = 0;
    public static final int BIG_HOP = 9;
    public static final int BIG_SLIP = -12;
    public static final int SMALL_HOP = 1;
    public static final int SMALL_SLIP = -2;
    public static final int PAVOL_JUMPS = 5;
}
class Hare extends Runner{
    public Hare(int currentPosition, int lane, String name){
        this.currentPosition = currentPosition;
        this.lane = lane;
        this.name = name;
        runnerSymbol = "H";

        moveDescription = name + " is READY! SET! GO!";
        allRunners.add(this);
    }

    @Override
    public void calculateMove() {
        int move = getMoveType();

        if (move >= 1 && move <= 20) {
            makeMove(MoveType.SLEEP);  //0
            moveDescription = name + " is sleeping (0)";
        } else if (move >= 21 && move <= 40) {
            makeMove(MoveType.BIG_HOP);   //9
            moveDescription = name + " made a Big Hop (+9)";
        } else if (move >= 41 && move <= 50) {
            makeMove(MoveType.BIG_SLIP);  //-12
            moveDescription = name + " made a Big Slip (-12)";
        }
        else if (move >= 51 && move <= 80){
            makeMove(MoveType.SMALL_HOP);  //1
            moveDescription = name + " made a Small Hop (+1)";
        }
        else {
            makeMove(MoveType.SMALL_SLIP);  //-2
            moveDescription = name + " made a Small Slip (-2)";
        }

    }
}
class Tortoise extends Runner{
    public Tortoise(int currentPosition, int lane, String name){
        this.currentPosition = currentPosition;
        this.lane = lane;
        this.name = name;
        runnerSymbol = "T";

        moveDescription = name + " is READY! SET! GO!";
        allRunners.add(this);
    }

    @Override
    public void calculateMove() {
        int move = getMoveType();

        if (move >= 1 && move <= 50){
            makeMove(MoveType.FAST_PLOD);
            moveDescription = name + " moved Fast plod (+3)";
        }
        else if (move >= 51 && move <= 70){
            makeMove(MoveType.SLIP);
            moveDescription = name + " Slipped (-6)";
        }
        else {
            makeMove(MoveType.SLOW_PLOD);
            moveDescription = name + " moved Slow Plod (+1)";
        }
    }
}
class Track{
    public static final int TRACK_LENGTH = 15;
    public static final int NUM_OF_RUNNERS = 3;

    public String[][] tracks;
    public Track(){
        tracks = new String[TRACK_LENGTH + 1][NUM_OF_RUNNERS];
    }
    public void displayRaceTrack(){
        System.out.println("   ");
        for (int i = 0; i <= TRACK_LENGTH; i++){
            System.out.print(i + "  |  ");
            for (int c = 0; c < NUM_OF_RUNNERS; c++){
                if (tracks[i][c] == null)
                    System.out.print(" | ");
                else
                    System.out.print(tracks[i][c] + "  |  ");
            }
            System.out.println("   ");
        }
    }
    public void runnerPosition(Runner runner){
        tracks[runner.origPosition][runner.lane] = null;
        tracks[runner.currentPosition][runner.lane] =runner.runnerSymbol;
    }
}

abstract class Runner{
    private static final Random rand = new Random();
    public int origPosition;
    public String runnerSymbol;
    public int currentPosition;
    public int lane;
    public String name;
    public String moveDescription;
    public static List<Runner> allRunners = new ArrayList<Runner>();

    public int getMoveType(){
        return  rand.nextInt(100) + 1;
    }
    public void makeMove(int spaces){
        origPosition = currentPosition;
        if (currentPosition + spaces < 0)
            currentPosition = 0;
        else if (currentPosition + spaces > Track.TRACK_LENGTH)
            currentPosition = Track.TRACK_LENGTH;
        else
            currentPosition += spaces;
    }
    public boolean isWinner(Runner runner){
        if (runner.currentPosition == Track.TRACK_LENGTH)
            return true;
        return false;
    }
    public abstract void calculateMove();
}

