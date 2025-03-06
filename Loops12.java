import java.util.Scanner;

public class Loops12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M or F: ");
        char gender = sc.next().charAt(0);

        switch (Character.toUpperCase(gender)) {
            case 'M' -> System.out.println("Male");
            case 'F' -> System.out.println("Female");
            default -> System.out.println("Invalid input.");
        }
        sc.close();
    }
}