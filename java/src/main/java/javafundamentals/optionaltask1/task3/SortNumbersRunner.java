package javafundamentals.optionaltask1.task3;

import javafundamentals.optionaltask1.ConsoleReader;

import java.util.Arrays;

public class SortNumbersRunner {
    public static void main(String[] args) {
        String[] inputNumbers = Arrays.stream(ConsoleReader.scanConsole()).mapToObj(String::valueOf).toArray(String[]::new);
        SortNumbers.calculateTheAverageLengthForAllNumbers(inputNumbers);
        SortNumbers.printNumberWhoseLengthIsLessThanAverageLength(inputNumbers);
        SortNumbers.printNumberWhoseLengthIsMoreThanAverageLength(inputNumbers);

    }
}
