import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter number: ");
        num1 = one.nextInt();

        num2 = one.nextInt();
        num2 = one.nextInt();
        num2 = one.nextInt();
        num2 = one.nextInt();
        num2 = one.nextInt();

        for (int number = 1; number <= num1 ; number++) {
            System.out.print(number + " ");
        }
    }

}
