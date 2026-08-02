package Code60;

import java.util.Scanner;

//Tower of Hanoi
public class Code627TowerOfHanoi {
    static int counter = 0;
    public static void main(String[] args) {
        int discs = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of discs: ");
        discs = Integer.parseInt(scanner.nextLine());
        scanner.close();

        Tower(discs, 1, 2, 3);
    }
    static void Tower(int n, int sourcePeg, int destinationPeg, int sparePeg){
        if (n == 1){
            System.out.println(counter + "  " + sourcePeg + "-->" + destinationPeg);
            counter++;
        }
        else {
            Tower(n - 1,sourcePeg, sparePeg, destinationPeg);
            System.out.println(counter+ "  " + sourcePeg + "-->" + destinationPeg);
            counter++;
            Tower(n - 1, sparePeg, destinationPeg, sourcePeg);
        }
    }
}
