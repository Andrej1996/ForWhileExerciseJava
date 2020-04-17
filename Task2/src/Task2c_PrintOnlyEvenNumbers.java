import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        int num;
        System.out.println("Enter number: ");
        num = one.nextInt();

        System.out.format("Enter %d numbers devided by spaces: %n ", num);
        int a;
        a = one.nextInt();

        while (a < num) {
            int z = one.nextInt();
            a++;

            if (z % 2 == 0) {
                System.out.print(z + " ");
            }
        }
    }
}
