package java_fundamentals.optional_task1.task_4;

import java_fundamentals.optional_task1.ConsoleReader;

public class SearchNumberWithTheMinimumNumberRunner {
    public static void main(String[] args) {
        SearchNumberWithTheMinimumNumber searchNumberWithTheMinimumNumber = new SearchNumberWithTheMinimumNumber();
        searchNumberWithTheMinimumNumber.searchingANumberWithAMinimumNumberOfDifferentDigits(ConsoleReader.scanConsole());
    }
}
