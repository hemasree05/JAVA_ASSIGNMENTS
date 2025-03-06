import java.util.Scanner;

public class Operators4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter second number: ");
        int num2 = s.nextInt();
        if (num1 == num2) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("Numbers are not equal.");
        }

        s.close();
    }
}