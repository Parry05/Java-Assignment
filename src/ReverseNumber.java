import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, reversed = 0;

        System.out.print("Enter an integer: ");
        number = sc.nextInt();

        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        System.out.println("The reversed number is: " + reversed);
    }
}
