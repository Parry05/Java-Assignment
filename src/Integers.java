import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, evenSum = 0, oddSum = 0;

        System.out.println("Enter a set of integers, type 'q' to quit:");
        while (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
    }
}
