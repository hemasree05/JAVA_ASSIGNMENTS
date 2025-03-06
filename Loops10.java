import java.util.Scanner;

public class Loops10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), r, rev = 0, t = n;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }

        System.out.println(t == rev ? "Palindrome" : "Not a Palindrome");
        sc.close();
    }
}