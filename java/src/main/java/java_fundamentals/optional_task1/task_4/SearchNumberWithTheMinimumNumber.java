package java_fundamentals.optional_task1.task_4;

import java_fundamentals.optional_task1.ConsoleReader;

import java.util.HashSet;

/**
 * Find the number in which the number of distinct digits is minimal. If there are several such numbers,
 * find the first one.
 */
public class SearchNumberWithTheMinimumNumber implements ConsoleReader {

    public void searchingANumberWithAMinimumNumberOfDifferentDigits(int[] inputNumbers) {
        int min = countingTheNumberOfDifferentDigitsOfANumber(inputNumbers[0]);
        int numberWithAMinimumNumberOfDistinctDigits = inputNumbers[0];
        for (int i = 1; i < inputNumbers.length; i++) {
            if (countingTheNumberOfDifferentDigitsOfANumber(inputNumbers[i]) < min) {
                min = countingTheNumberOfDifferentDigitsOfANumber(inputNumbers[i]);
                    numberWithAMinimumNumberOfDistinctDigits = inputNumbers[i];
                }
            }
        System.out.printf("А number with a minimum number of distinct digits: %d", numberWithAMinimumNumberOfDistinctDigits);
    }

    static int countingTheNumberOfDifferentDigitsOfANumber(int x) {
        HashSet<Integer> numberOfDifferentDigitsOfNumber = new HashSet<>();
        while (x > 0) {
            numberOfDifferentDigitsOfNumber.add(x % 10);
            x /= 10;
        }
        return numberOfDifferentDigitsOfNumber.size();
    }
}

