public class Operators2 {
    static void incrementDecrement() {
        int n = 10;
        System.out.println("Original Value: " + n);
        System.out.println("Post-Increment: " + (n++));
        System.out.println("After Post-Increment: " + n);
        System.out.println("Pre-Increment: " + (++n));
        System.out.println("Post-Decrement: " + (n--));
        System.out.println("After Post-Decrement: " + n);
        System.out.println("Pre-Decrement: " + (--n));
    }

    public static void main(String[] args) {
        incrementDecrement();
    }
}