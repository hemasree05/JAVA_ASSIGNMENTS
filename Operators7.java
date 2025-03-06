import java.util.Scanner;

public class Operators7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = a.nextInt();
        System.out.print("Enter second number: ");
        int num2 = a.nextInt();

        int s = (num1 < num2) ? num1 : num2;
        int l = (num1 > num2) ? num1 : num2;

        System.out.println("Smaller number: " + s);
        System.out.println("Larger number: " + l);

        a.close();
    }
}