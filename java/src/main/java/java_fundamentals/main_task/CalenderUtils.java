package java_fundamentals.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Enter a number from 1 to 12. Output to the console the name of the month corresponding to the given number.
 * Check the correctness of entering numbers.
 */

public class CalenderUtils {
    static int numberOfMonth;

    public static void main(String[] args) {
        readConsole();
        printTheNameOfTheMonthCorrespondingToTheGivenNumber();
    }

    public static void readConsole() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the number between 1 - 12 and press <Enter>");
            String enteredNumbers = reader.readLine();
            numberOfMonth = Integer.parseInt(enteredNumbers);
           reader.close();
        } catch (IOException e) {
            System.err.printf("Something goes wrong: %s", e);
        }
    }

    public static void printTheNameOfTheMonthCorrespondingToTheGivenNumber() {
        System.out.println("Month " + numberOfMonth + " = "
                + Month.of(numberOfMonth).getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH));
    }
}
