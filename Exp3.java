class Exp3 {
    static void divide() throws ArithmeticException {
        int result = 10 / 0;
        System.out.println(result);
    }

    public static void main(String[] args) {
        divide(); 
    }
}