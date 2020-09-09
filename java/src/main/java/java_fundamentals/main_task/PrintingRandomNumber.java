package java_fundamentals.main_task;

/**
 * Print a given quantity of random numbers with the transition to a new line
 * and without the transition to a new line
 */
public class PrintingRandomNumber {
    public static void main(String[] args) {
        printRandomNumbers(args);
    }

    /**
     * This method print random numbers from 0 to 10 depends on args[0] integer value
     * @param args - quantity of numbers to generate
     */
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


