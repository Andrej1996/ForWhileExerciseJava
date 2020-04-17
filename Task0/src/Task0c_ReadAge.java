import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        int age;
        System.out.println("Enter age: ");
        age = one.nextInt();

        if (age >= 18 && age < 120){
            System.out.println("You are adult!");
        }else if(age > 120) {
            System.out.println("You are not human!");
        }else
            System.out.println("You are not adult!");
        }
    }

