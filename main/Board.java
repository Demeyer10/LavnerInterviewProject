package main;

public class Board {
    public String[] boardValues = { "0", "1", "2", "3", "4", "5", "6", "7", "8" };
    boolean gameOver = false;

    public void drawBoard() {
        System.out.println();
        System.out.printf("%s | %s | %s%n", this.boardValues[0], this.boardValues[1], this.boardValues[2]);
        System.out.printf("--+---+--%n");
        System.out.printf("%s | %s | %s%n", this.boardValues[3], this.boardValues[4], this.boardValues[5]);
        System.out.printf("--+---+--%n");
        System.out.printf("%s | %s | %s%n", this.boardValues[6], this.boardValues[7], this.boardValues[8]);
        System.out.println();
    }

}
