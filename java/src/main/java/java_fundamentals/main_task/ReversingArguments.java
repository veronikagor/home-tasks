package java_fundamentals.main_task;

/**
 * Display string arguments in reverse order to the console.
 */
public class ReversingArguments {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}


