class Exp6 extends Exception {
    public Exp6(String message) {
        super(message);
    }
}

class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new Exp6("This is a custom exception");
        } catch (Exp6 e) {
            System.out.println(e.getMessage());
        }
    }
}
