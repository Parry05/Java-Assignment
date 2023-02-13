public class NaturalNumbers {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;

        while (number <= 10) {
            sum += number;
            number++;
        }

        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }
}
