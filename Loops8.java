import java.util.Scanner;

public class Loops8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = a.nextInt();
        int origNum = n, sum = 0, r;

        while (n > 0) {
            r = n % 10;
            sum += r * r * r;
            n/= 10;
        }

        if (sum == origNum)
            System.out.println(origNum + " is an Armstrong number.");
        else
            System.out.println(origNum + " is not an Armstrong number.");

        a.close();
    }
}