package javafundamentals.maintask;

/**
 * Enter integers as string arguments, count their sum(product), and output the result to command line.
 */
public class SumAndProductOfArguments {
    public static void main(String[] args) {
        int sumOfArguments = 0;
        int productOfArguments = 1;
        try {
            for (int i = 0; i < args.length; i++) {
                int argument = Integer.parseInt(args[i]);
                sumOfArguments = sumOfArguments + argument;
                productOfArguments = productOfArguments * argument;
            }
        } catch (NumberFormatException e) {
            System.out.println("Input error " + e);
            System.out.close();
        }
        System.out.println("Sum of arguments " + sumOfArguments);
        System.out.println("Product of arguments " + productOfArguments);
    }
}
