class Thissuper4 {
    Thissuper4() {
        this(400);
    }

    Thissuper4(int num) {
        System.out.println("Parameterized constructor called with value: " + num);
    }

    public static void main(String[] args) {
        Thissuper4 obj = new Thissuper4();
    }
}