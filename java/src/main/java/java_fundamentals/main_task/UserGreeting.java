package java_fundamentals.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Greet any user when entering their name through the command line.
 */
public class UserGreeting {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        try {
            System.out.println("Enter your name and press <Enter>");
            String name = reader.readLine();
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            System.out.println("Input Error  " + e);
        }

    }
}
