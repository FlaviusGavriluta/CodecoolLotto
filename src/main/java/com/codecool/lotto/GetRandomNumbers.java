package com.codecool.lotto;

import java.util.Random;

public class GetRandomNumbers {
    private static final Random random = new Random();

    public int[] getRandomNumbers(int quantity, int maxNumber) {
        int[] numbers = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            int randomNumber;
            boolean isUnique;
            do {
                randomNumber = random.nextInt(maxNumber) + 1;
                IsMatching isMatching = new IsMatching();
                isUnique = isMatching.isMatching(randomNumber, numbers);
            }
            while (isUnique);
            numbers[i] = randomNumber;
        }
        return numbers;
    }

}
