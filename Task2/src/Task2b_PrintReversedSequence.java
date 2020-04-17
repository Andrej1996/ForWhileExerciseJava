import java.util.Scanner;

public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        int a;
        System.out.println("Enter number: ");
        a = one.nextInt();

        while (a >= 1) {
            System.out.print(a + " ");
            a--;
        }
    }
}
