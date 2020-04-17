import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int num1;
        boolean isPrime = true;
        System.out.print("Enter number: ");
        num1 = one.nextInt();

        for (int num2 = 2; num2 < num1; num2++ ) {
            if ( num1 % num2 == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.println(num1 + " is prime a number.");
        }else {
            System.out.println(num1 + " is not a prime number.");
        }

    }
}
