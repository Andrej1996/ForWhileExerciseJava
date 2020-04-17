import java.util.Scanner;

public class Task3a_PrintSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a whole number to generate a square: ");
        int number;
        number = sc.nextInt();

        for (int a = 1; a <= number; a++) {
            for (int j = 1; j <= number; j++) {
                if (a == 1 || a == number) {
                    System.out.print("* ");
                } else if (j == 1 || j == number) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}