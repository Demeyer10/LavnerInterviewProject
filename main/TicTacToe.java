package main;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        // Scanner will allow for user input
        Scanner sc = new Scanner(System.in);

        // Create a baord class
        Board board = new Board();

        // Create the players of the game
        Player player1 = new Player();
        Player player2 = new Player();
        player1.createPlayer(1, sc, "X");
        player2.createPlayer(2, sc, "O");

        // Creating Game handler to handle game functionality
        GameHandler gh = new GameHandler();
        gh.GameHandler(board);
        gh.startGame(sc, player1, player2);

    }
}