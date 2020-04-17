import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int number;
        int sumNumber = 0;

        System.out.println("Enter number: ");
        number = one.nextInt();

        while (number > 0) {
            sumNumber = sumNumber + number%10;
            number = number / 10;
        }
        System.out.println("Some of the digits is: " + sumNumber);


    }
}
