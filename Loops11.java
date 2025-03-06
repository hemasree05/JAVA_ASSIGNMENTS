import java.util.Scanner;
public class Loops11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();

        switch (n% 2) {
            case 0 -> System.out.println(n + " is Even.");
            default -> System.out.println(n + " is Odd.");
        }
        sc.close();
    }
}