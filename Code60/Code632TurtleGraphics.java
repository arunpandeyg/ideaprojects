package Code60;
//turtle graphics


import java.util.Scanner;

public class Code632TurtleGraphics {
    public static void main(String[] args) {
    GameT gameT = new GameT();
    gameT.gameLoop();
    }

}
class GameT{
    private Pen.PenActions pen;
    private Directions.TurtleDirections direction;
    private final Turtle turtle;
    private final GameBoard gameBoard;
    private boolean quit; //quit the game
    private int option;
    private final Scanner scanner;

    public GameT(){
        turtle = new Turtle();
        gameBoard = new GameBoard();
        quit = false;
        scanner = new Scanner(System.in);
        pen = Pen.PenActions.UP;
        direction = Directions.TurtleDirections.SOUTH;
    }
    public void gameLoop(){
        gameBoard.initGameBoard();

        do {
            System.out.println(Messages.errorMessage);
            Messages.errorMessage = "";
            gameBoard.drawGameBoard(turtle.positionX, turtle.positionY, turtle.turtleSymbol);
            Messages.instructions();   //display game instructions.
            System.out.println("Pen is " +(pen == Pen.PenActions.UP? " NOT DRAWING" : " DRAWING"));
            System.out.println("Turtle is moving " + direction.toString());
            System.out.println("Select your option: ");
            option = Integer.parseInt(scanner.nextLine());
            if (option == 1)
                pen = Pen.PenActions.UP;
            else if (option == 2)
                pen = Pen.PenActions.DOWN;
            else if (option == 3)
                direction = Directions.TurtleDirections.NORTH;
            else if (option == 4)
                direction = Directions.TurtleDirections.EAST;
            else if (option == 5)
                direction = Directions.TurtleDirections.SOUTH;
            else if (option == 6)
                direction = Directions.TurtleDirections.WEST;
            else if (option == 7)
                quit = true;
            else
                Messages.invalidInput();

            if (option == 3 || option == 4 || option == 5 || option == 6){
                System.out.println("Turtle is moving " + direction.toString());
                System.out.println("Enter number of spaces to move: ");
                int spaces = Integer.parseInt(scanner.nextLine());
                turtle.walk(direction, spaces, pen);
            }

        }while (!quit);
    }
}
class Turtle{
    public char turtleSymbol;
    public int positionX;
    public int positionY;

    public Turtle(){
        turtleSymbol = 'X';
        positionX = 0;
        positionY = 0;
    }

    public void walk(Directions.TurtleDirections direction, int spaces, Pen.PenActions pen){
    if (validateMove(direction, spaces)){
        boolean toDraw = (pen == Pen.PenActions.DOWN);
        switch (direction){
            case NORTH -> {
                if (toDraw ) {
                    GameBoard.updateGameBoardX(positionX, spaces, -1, positionY);
                    positionX -= spaces;
                }
            }
            case SOUTH ->{
                if (toDraw ) {
                    GameBoard.updateGameBoardX(positionX, spaces, 1, positionY);
                    positionX += spaces;
                }
            }
            case EAST -> {if (toDraw ) {
                GameBoard.updateGameBoardX(positionY, spaces, 1, positionX);
                positionY += spaces;
                }
            }
            case WEST -> {if (toDraw ) {
                GameBoard.updateGameBoardX(positionY, spaces, -1, positionX);
                positionY -= spaces;
            }
            }
        }
        }
    }

    private boolean validateMove(Directions.TurtleDirections direction, int spaces){
        if (direction == Directions.TurtleDirections.NORTH && (positionX - spaces) < 0){
            Messages.invalidMove(direction, positionX);
            return false;
        }
        if (direction == Directions.TurtleDirections.EAST && (positionY + spaces) > GameBoard.GAME_BOARD_SIZE - 1){
            Messages.invalidMove(direction, GameBoard.GAME_BOARD_SIZE - positionY - 1);
            return false;
        }
        if (direction == Directions.TurtleDirections.SOUTH && (positionX + spaces) > GameBoard.GAME_BOARD_SIZE - 1){
            Messages.invalidMove(direction, GameBoard.GAME_BOARD_SIZE - positionX - 1);
            return false;
        }
        if (direction == Directions.TurtleDirections.WEST && (positionY - spaces) < 0){
            Messages.invalidMove(direction, positionY);
            return false;
        }
        return true;
    }
}

final class Pen{
    public enum PenActions{
        UP (1),
        DOWN (2);

        private PenActions(int value){ }
    }
}

final class Directions{
    public enum TurtleDirections{
        NORTH (3),
        EAST (4),
        SOUTH (5),
        WEST (6);
        private TurtleDirections(int value){}
    }
}
 final class Messages{
    public static void instructions(){
        System.out.println("Type your commands to draw on the game board");
        System.out.println("1 = pen up; 2 = pen down");
        System.out.println("3 = North, 4 = East, 5 = South, 6 = West");
        System.out.println("7 = Quit");
    }
     public static String errorMessage = " ";

     public static void invalidInput(){
        errorMessage = "\nINVALID INPUT. Input must be an Integer between 1 - 7\n";
    }
    public static void invalidMove(Directions.TurtleDirections direction, int spaces){
         errorMessage = "\nINVALID MOVE. You can only move " +spaces+ " spaces to the " +direction + "\n";
    }
}

class GameBoard{
    public final static int GAME_BOARD_SIZE = 20; //DEFAULT SIZE
    public final static char USED_SPACE= '0';
    public final static char GAME_BOARD_SYMBOL = '.';
    public static char[][] gameBoardArray; //array will be updating with our moves.

    public GameBoard() {
        gameBoardArray = new char[GAME_BOARD_SIZE][GAME_BOARD_SIZE];
    }

    public static void updateGameBoardX(int start, int spaceToMove, int upOrDown, int constantY){
        for (int i = 0; i < spaceToMove; i++){
            gameBoardArray[start + (i * upOrDown)][constantY] = USED_SPACE;
        }
    }

    public static void updateGameBoardY(int start, int spaceToMove, int leftOrRight, int constantX){
        for (int i = 0; i < spaceToMove; i++){
            gameBoardArray[start + (constantX)][start + (i * leftOrRight)] = USED_SPACE;
        }
    }

    public void drawGameBoard(int posX, int posY, char turtle){
        for (int i = 0; i < GAME_BOARD_SIZE; i++){
            for (int c = 0; c < GAME_BOARD_SIZE; c++){
                if (i == posX && c == posY){
                    System.out.print(turtle);
                }
                else
                    System.out.print(gameBoardArray[i][c]+" ");
            }
            System.out.println("  ");
        }
    }

    public void initGameBoard(){
        for (int i = 0; i < GAME_BOARD_SIZE; i++){
            for (int c = 0; c < GAME_BOARD_SIZE; c++){
                gameBoardArray[i][c] = GAME_BOARD_SYMBOL;
            }
        }
    }
}
