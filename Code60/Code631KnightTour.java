package Code60;
//Knight tour (brute force)


import java.util.Random;

public class Code631KnightTour {
    public static void main(String[] args) {
    Knight knight = new Knight();
    knight.move();

    }
}
class Knight {
    private static final Random rand = new Random();
    private int curH;
    private int curV;
    private final Bord bord;
    private boolean isFullTour = false;
    private boolean isEndTour = false;
    private static int bestScore = 0; //store the most number of moves made in one tour so far
    private static int tourCount = 0; //count all incomplete tours
    private int moveCounter;

    public Knight() {
        bord = new Bord();
    }

    private void getTourResults() {
        isEndTour = true;
        if (moveCounter == Bord.SIZE * Bord.SIZE) {
            isFullTour = true;
            bord.displayBoard();
            System.out.println("SUCCESS. the tour #" + tourCount + " was a complete tour !\n");
            return;
        }

        if (moveCounter == bestScore) {
            bord.displayBoard();
            System.out.println("No success. the best score is still " + bestScore +
                    " move reached again on this this tour #" + tourCount + "\n");
        }
        else if (moveCounter > bestScore){
            bestScore = moveCounter;
            bord.displayBoard();
            System.out.println("No success. the best score is still " + bestScore +
                    " move reached again on this this tour #" + tourCount + "\n");
        }
    }

    public void move() {
        while (!isFullTour) {
            curH = rand.nextInt(Bord.SIZE);
            curV = rand.nextInt(Bord.SIZE);
            moveCounter = 1;
            bord.populateArray(curH, curV);
            isEndTour = false;

            do {
                if (!isMoving())
                    getTourResults();
            } while (!isEndTour);
        }
    }


    public boolean isMoving() {
        int[] movesTaken = {0, 0, 0, 0, 0, 0, 0, 0};
        boolean allMovesUsed = false;

        while (!allMovesUsed) {
            int i = rand.nextInt(8);
            if (movesTaken[i] == 0) {
                int hMove = curH + bord.getHorizontal(i);
                int vMove = curV + bord.getVertical(i);
                if (hMove >= 0 && hMove < Bord.SIZE && vMove >= 0 && vMove < Bord.SIZE &&
                        Bord.chessBoard[hMove][vMove] == Bord.BOARD_SYMBOL) {
                    curH = hMove;
                    curV = vMove;
                    Bord.chessBoard[curH][curV] = Bord.MOVE_SYMBOL;
                    moveCounter++;
                    return true;
                }
                movesTaken[i] = 1;
            }
            int c = 0;
            for (int moves : movesTaken) {
                c += moves;
            }
            if (c == 8) {
                allMovesUsed = true;
            }
            tourCount++;
            return false;
        }
        return true; // i have added this
    }

    static class Bord {
        public static final int SIZE = 8;
        public static final char BOARD_SYMBOL = '.';
        public static final char MOVE_SYMBOL = 'X';
        private final int[] horizontal;
        private final int[] vertical;
        public static char[][] chessBoard;

        public Bord() {
            horizontal = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
            vertical = new int[]{-1, -2, -2, -1, 1, 2, 2, 1};
            chessBoard = new char[SIZE][SIZE];
        }

        public int getHorizontal(int i) {return this.horizontal[i];}

        public int getVertical(int i) {return vertical[i];}

        public void displayBoard() {
            System.out.print(" ");
            for (int i = 65; i < SIZE + 65; i++)
                System.out.print((char) i);
            System.out.println(" ");

            for (int r = 0; r < SIZE; r++) {
                System.out.print(r + 1 + " ");
                for (int c = 0; c < SIZE; c++) {
                    System.out.print(chessBoard[r][c]);
                }
                System.out.println(" ");
            }
        }

        public void populateArray(int curH, int curV) {
            for (int i = 0; i < SIZE; i++) {
                for (int c = 0; c < SIZE; c++) {
                    chessBoard[i][c] = BOARD_SYMBOL;
                }
            }
            chessBoard[curH][curV] = MOVE_SYMBOL;
        }
    }
}

