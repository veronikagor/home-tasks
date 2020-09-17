package javafundamentals.maintask;

/**
 * Print a given quantity of random numbers with the transition to a new line
 * and without the transition to a new line
 */
public class PrintingRandomNumber {
    public static void main(String[] args) {
        printRandomNumbers(args);
    }

    public static void printRandomNumbers(String[] args) {
        String randomNumbers = "";
        try {
            if (Integer.parseInt(args[0]) > 0) {
                for (int i = 0; i < Integer.parseInt(args[0]); i++) {
                    double randomNumber = Math.random() * 10;
                    randomNumbers = randomNumbers + (int) randomNumber + " ";
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + args[0]);
            System.out.close();
        }
        System.out.println("Random numbers without the transition to a new line: " + randomNumbers);
        System.out.println("Random numbers with the transition to a new line: " + "\n" + randomNumbers.replaceAll(" ", "\n"));
    }
}


