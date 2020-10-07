package javacollections.optionaltask.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

/**
 * Take a number from command line argument and add its digits to the stack.
 * Save a number whose digits are in reverse order to a file.
 */
public class ReversingNumber {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        try {
            char[] digitsOfNumber = args[0].toCharArray();
            if (Integer.parseInt(args[0]) != 0) {
                for (char digit : digitsOfNumber) {
                    stack.push(digit);
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Input error: " + e);
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("java/data/reversedNumber.txt"));
            int limit = stack.size();
            for (int i = 0; i < limit; i++) {
                writer.write(stack.pop());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
