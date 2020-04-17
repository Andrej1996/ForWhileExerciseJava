import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number;
        number = one.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " , ");
            }
        }
        System.out.println(number);
    }
}
