package javafundamentals.optionaltask1.task3;

import javafundamentals.optionaltask1.ConsoleReader;

/**
 * Print to the console those numbers whose length is less (more) than the average length for all numbers,
 * as well as the length.
 */
public class SortNumbers implements ConsoleReader {

    static double averageLengthForAllInputNumbers;

    public static double calculateTheAverageLengthForAllNumbers(String[] inputNumbers) {
        int lengthOfAllInputNumbers = 0;
        for (String inputNumber : inputNumbers) {
            lengthOfAllInputNumbers += inputNumber.length();
            if (Integer.valueOf(inputNumber) != 0)
                averageLengthForAllInputNumbers = lengthOfAllInputNumbers / inputNumbers.length;
        }
        System.out.printf("The average length for all input numbers: %f\n", averageLengthForAllInputNumbers);
        return averageLengthForAllInputNumbers;
    }

    public static void printNumberWhoseLengthIsLessThanAverageLength(String[] inputNumbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String inputNumber : inputNumbers) {
            if (inputNumber.length() < averageLengthForAllInputNumbers)
                stringBuilder.append(inputNumber)
                        .append(String.format(" (The length of number: %d) ", inputNumber.length()));
        }
        System.out.printf("Numbers whose length is less than the average length for all numbers: %s\n", stringBuilder);
    }

    public static void printNumberWhoseLengthIsMoreThanAverageLength(String[] inputNumbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String inputNumber : inputNumbers) {
            if (inputNumber.length() > averageLengthForAllInputNumbers)
                stringBuilder.append(inputNumber)
                        .append(String.format(" (The length of number: %d) ", inputNumber.length()));
        }
        System.out.printf("Numbers whose length is more than the average length for all numbers: %s\n", stringBuilder);
    }
}

