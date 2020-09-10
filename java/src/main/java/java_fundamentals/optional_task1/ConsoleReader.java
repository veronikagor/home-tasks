package java_fundamentals.optional_task1;

import java.util.Scanner;

public interface ConsoleReader {
   static int[] scanConsole() {
        Scanner scanner = new Scanner(System.in);
        int i = -1;
        int numberOfInteger = 0;
        int[] inputNumbers = new int[numberOfInteger];
        System.out.print("Enter the quantity of integer: ");

        do {
            String input = null;
            try {
                input = scanner.nextLine();
                numberOfInteger = Integer.parseInt(input);
                if (numberOfInteger > 0) {
                    i = numberOfInteger;
                    inputNumbers = new int[numberOfInteger];
                } else {
                    System.out.println("Your input is not positive integer: " + input);
                    System.out.println("Please type a valid integer: ");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Your input is not integer: " + input);
                System.out.println("Please type a valid integer: ");
            }
        }
        while (i < 0);

        System.out.print("Enter the numbers one at a time and press <Enter>: ");
        for (int x = 0; x < numberOfInteger; x++) {
            if (!scanner.hasNextInt()) {
                System.out.println("Didn't understand your input: " + scanner.next());
                System.out.println("Please type a valid integer: ");
                --x;
            } else {
                inputNumbers[x] = scanner.nextInt();
            }
        }
        scanner.close();
//        Arrays.stream(inputNumbers).forEach(e -> System.out.println(e));
        return inputNumbers;
    }

}


