package com.codecool.lotto;

import static java.lang.System.out;

public class ComputerPlayer {
    public void playComputerGame(int quantity, int maxNumber) {
        boolean computerWon = false;

        while (!computerWon) {
            GetRandomNumbers get = new GetRandomNumbers();
            int[] winningNumbers = get.getRandomNumbers(quantity, maxNumber);
            int[] chosenNumber = get.getRandomNumbers(1, maxNumber);

            out.println("The computer selected the following number: " + chosenNumber[0]);
            IsMatching isMatching = new IsMatching();
            computerWon = isMatching.isMatching(chosenNumber[0], winningNumbers);

            out.println("Winning numbers are:");
            for (int number : winningNumbers) {
                out.print(number + " ");
            }
            out.println("Sorry, the computer didn't win this time. Let's play again!");
            out.println();
        }
        out.println("Congratulations! The computer is a winner!");
    }

}
