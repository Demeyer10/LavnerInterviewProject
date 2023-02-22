package main;

import java.util.Scanner;

public class Player {
    int win = 0, loss = 0;
    String name, playerValue;

    public void createPlayer(int playerNumber, Scanner sc, String playerValue) {
        System.out.printf("Please, Enter player%d name: ", playerNumber);
        this.name = sc.next();
        this.playerValue = playerValue;
    }

}
