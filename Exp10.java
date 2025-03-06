class Exp10 {
    public static void main(String[] args) {
        try {
            Class.forName("UnknownClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception caught.");
        }
    }
}
