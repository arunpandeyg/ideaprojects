package Code60;
//java puzzles game and algorithms exercises 1/7
//eight queens


import java.util.Random;

public class Code625Queen {
    public static void main(String[] args) {
    Run run = new Run();
    run.placeQueens();
    }
}
class Run{
    private final Board board; //i made final Board
    private int runCounter; //count attempts till finish
    private int queensCounter;
    private boolean[] usedRows; //check if 1 row doesn't have more than 1 queen
    private static Random rand;

    public Run(){
        rand = new Random();
        board = new Board();
        usedRows = new boolean[8];
        runCounter = 0;
        queensCounter = 0;
    }
    public void placeQueens(){
        board.init();
        do {
            setPositions();
            System.out.println(runCounter);
        }while (!isWinner());
        System.out.println("It took "+runCounter+ " attempts to make the queens set up correctly");
    }
    public boolean isWinner(){
        board.displayBoard();
        System.out.println();
        int attackingQueenCounter = 0;
        for (int c = 0; c < 7; c++){    //1st quarter
            for (int r = 0; r <= 7 - c; r++){
                if (board.board[r][c + r] != board.BOARD_CHAR){
                    attackingQueenCounter++;
                    if (!countQueens(attackingQueenCounter))
                        return false;
                }
            }
            attackingQueenCounter = 0;
        }
        attackingQueenCounter = 0;
        for (int r = 0; r < 7; r++){    //2nd quarter
            for (int c = 7; c >= r; c--){
                if (board.board[7 - c + r][c] != board.BOARD_CHAR){
                    attackingQueenCounter++;
                    if (!countQueens(attackingQueenCounter))
                        return false;
                }
            }
            attackingQueenCounter = 0;
        }
        attackingQueenCounter = 0;
        for (int c = 7; c > 0; c--){  //3rd quarter
            for (int r = 7; r >= 7 - c; r--){
                if (board.board[r][c + r - 7] != Board.BOARD_CHAR){
                    attackingQueenCounter++;
                    if (!countQueens(attackingQueenCounter))
                        return false;
                }
            }
            attackingQueenCounter = 0;
        }
        attackingQueenCounter = 0;
        for (int r = 7; r > 0; r--){   //4th  quarter
            for (int c = 0; c <= r; c++){
                if (board.board[r - c][c] !=Board.BOARD_CHAR){
                    attackingQueenCounter++;
                    if (!countQueens(attackingQueenCounter))
                        return false;
                }
            }
            attackingQueenCounter = 0;
        }
        return true;
    }
    private boolean countQueens(int attackingQueenCounter){
        if (attackingQueenCounter > 1){
            queensCounter = 0;
            usedRows = new boolean[8];
            board.init();
            return false;
        }
        return true;
    }
    public void setPositions(){
        int col = 0;
        int row = 0;

        while (queensCounter < 8){
            row = rand.nextInt(8);
            if (isValidRow(row)){
                board.board[row][col] = Board.QUEEN_CHAR;
                col++;
                queensCounter++;
            }
        }
        runCounter++;
    }
    public boolean isValidRow(int row){
        if (!usedRows[row]){
            usedRows[row] = true;
            return true;
        }
        return false;
    }
}
class  Board{
    public static final char BOARD_CHAR = '.';
    public static final char QUEEN_CHAR = 'X';
    public char[][]  board;

    public Board(){
        board = new char[8][8];
    }

    public void displayBoard(){
        for (int i = 0; i < 8; i++){
            for (int c = 0; c < 8; c++){
                System.out.print(board[i][c] + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }
    public void  init(){
        for (int i = 0; i < 8; i++){
            for (int c = 0; c < 8; c++){
                board[i][c] = BOARD_CHAR;
            }
        }
    }

}
