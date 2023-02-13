import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = 1;
        int factorial = 1;
        num = sc.nextInt();
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= num);
        System.out.println("factorial of the num is = " +factorial);
    }
}