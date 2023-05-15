package com.codecool.lotto;

import static java.lang.System.out;

public class Application {
    public static void main(String[] args) {
        int quantity = 6;
        int maxNumber = 39;

        out.println("Do you want to play the Codecool Lotto game yourself?\n Or let the computer play? (1 for yourself, 2 for computer)");

        GetUserChoice get = new GetUserChoice();
        int yourChoice = get.getUserChoice(1, 2);

        if (yourChoice == 1) {
            Player player = new Player();
            player.playGame(quantity, maxNumber);
        } else {
            ComputerPlayer computerPlayer = new ComputerPlayer();
            computerPlayer.playComputerGame(quantity, maxNumber);
        }
    }
}
