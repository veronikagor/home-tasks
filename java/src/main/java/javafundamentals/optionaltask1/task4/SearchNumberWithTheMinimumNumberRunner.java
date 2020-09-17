package javafundamentals.optionaltask1.task4;

import javafundamentals.optionaltask1.ConsoleReader;

public class SearchNumberWithTheMinimumNumberRunner {
    public static void main(String[] args) {
        SearchNumberWithTheMinimumNumber searchNumberWithTheMinimumNumber = new SearchNumberWithTheMinimumNumber();
        searchNumberWithTheMinimumNumber.searchingANumberWithAMinimumNumberOfDifferentDigits(ConsoleReader.scanConsole());
    }
}
