package main;

import java.util.Scanner;

public class GameHandler {
    Board board;

    public void GameHandler(Board board) {
        this.board = board;
    }

    public void startGame(Scanner sc, Player player1, Player player2) {
        this.board.drawBoard();
        int turn = 1;
        int placement;
        while (!this.board.gameOver) {
            if (turn == 1) {
                do {
                    System.out.printf("Please, Enter the number where you want to place your %s: ",
                            player1.playerValue);
                    placement = sc.nextInt();
                    if (placement > 9) {
                        System.out.println("Number entered is not on board");
                    } else if (this.board.boardValues[placement] != "X" && this.board.boardValues[placement] != "O") {
                        this.board.boardValues[placement] = player1.playerValue;
                        turn++;
                    } else {
                        System.out.println("A player has already taken that space");
                    }
                } while (turn != 2);
                board.drawBoard();
            } else {
                do {
                    System.out.printf("Please, Enter the number where you want to place your %s: ",
                            player2.playerValue);
                    placement = sc.nextInt();
                    if (placement > 9) {
                        System.out.println("Number entered is not on board");
                    } else if (this.board.boardValues[placement] != "X" && this.board.boardValues[placement] != "O") {
                        this.board.boardValues[placement] = player2.playerValue;
                        turn--;
                    } else {
                        System.out.println("A player has already taken that space");
                    }
                } while (turn != 1);
                board.drawBoard();

            }
        }
    }
}
