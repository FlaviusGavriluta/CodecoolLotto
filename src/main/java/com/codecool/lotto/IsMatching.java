package com.codecool.lotto;

public class IsMatching {
    public boolean isMatching(int chosenNumber, int[] winningNumbers) {
        for (int number : winningNumbers) {
            if (number == chosenNumber)
                return true;
        }
        return false;
    }
}
