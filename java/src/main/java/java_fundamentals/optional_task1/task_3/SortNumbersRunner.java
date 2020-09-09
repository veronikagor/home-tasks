package java_fundamentals.optional_task1.task_3;

import java_fundamentals.optional_task1.ConsoleReader;

import java.util.Arrays;

public class SortNumbersRunner {
    public static void main(String[] args) {
        String[] inputNumbers = Arrays.stream(ConsoleReader.scanConsole()).mapToObj(String::valueOf).toArray(String[]::new);
        SortNumbers.calculateTheAverageLengthForAllNumbers(inputNumbers);
        SortNumbers.printNumberWhoseLengthIsLessThanAverageLength(inputNumbers);
        SortNumbers.printNumberWhoseLengthIsMoreThanAverageLength(inputNumbers);

    }
}
