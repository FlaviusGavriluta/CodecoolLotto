package com.codecool.lotto;

import static java.lang.System.out;

public class Player {
    public void playGame(int quantity, int maxNumber) {
        GetRandomNumbers getRandom = new GetRandomNumbers();
        int[] winningNumbers = getRandom.getRandomNumbers(quantity, maxNumber);

        out.println("You have to guess one of the " + quantity + "/" + maxNumber + " winning numbers.");

        GetUserChoice getUser = new GetUserChoice();
        int choosenNumber = getUser.getUserChoice(1, maxNumber);

        out.println("Winning numbers are:");
        for (int number : winningNumbers) {
            out.print(number + " ");
        }
        out.println();

        IsMatching isMatching = new IsMatching();
        if (isMatching.isMatching(choosenNumber, winningNumbers))
            out.println("Congratulations! You are a winner!");
        else
            out.println("Better luck next time! Keep playing and you might become a winner!");
    }

}
