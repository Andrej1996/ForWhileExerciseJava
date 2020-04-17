import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int number;
        System.out.println("Enter number: ");
        number = one.nextInt();

        int firstDigit = number;

        while (firstDigit > 9){

            firstDigit = firstDigit / 10;
        }
        System.out.println("The First Digit is " + firstDigit);
    }

}





