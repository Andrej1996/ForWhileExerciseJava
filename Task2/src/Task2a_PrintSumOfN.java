import java.util.Scanner;

public class Task2a_PrintSumOfN {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        int a;
        System.out.println("Enter number: ");
        a = one.nextInt();

        System.out.format("Enter %d numbers devided by spaces or enter: %n", a);

        int sum = 0;

        for (int b = 0; b < a; b++) {

            int z;
            z = one.nextInt();

            sum = sum + z;
        }

        System.out.format("The sum of the numbers is: %d",sum);


        }
    }

