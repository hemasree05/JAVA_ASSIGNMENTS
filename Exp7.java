class Exp7 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception handled.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
