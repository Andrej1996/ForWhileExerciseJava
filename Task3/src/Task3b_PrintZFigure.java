import java.util.Scanner;

public class Task3b_PrintZFigure {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int a;
        a = one.nextInt();

        for (int row = 0; row < a; row++) {
            for (int column = 0; column < a; column++) {
                if (row == 0 || row == a - 1 || column == a - 1 - row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
