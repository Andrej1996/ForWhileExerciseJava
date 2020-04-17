import java.util.Scanner;

public class Task0d_ReadNNumbers {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int number;

        System.out.println("Enter number: ");
        number = one.nextInt();

        do {
            System.out.println(number);
            number++;
        } while ( number < 6);




    }
}
