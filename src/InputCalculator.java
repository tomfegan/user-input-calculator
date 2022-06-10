import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        long average = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number/s: ");

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (!isAnInt) {
                break;
            } else {
                int inputtedValue = scanner.nextInt();

                sum = sum + inputtedValue;
                count++;
                average = Math.round( (double)sum/count);
                scanner.nextLine();

            }
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
