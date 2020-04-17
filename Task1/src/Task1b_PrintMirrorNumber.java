import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        int number;
        int mirroredNumber = 0;

        System.out.print("Enter the number to reverse: ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        while (number != 0) {
            mirroredNumber = mirroredNumber * 10;
            mirroredNumber = mirroredNumber + number % 10;
            number = number / 10;
        }

        System.out.println("Mirrored number is: "+mirroredNumber);
    }
}
