class Constructor1 {
    Constructor1() {
        System.out.println("Default Constructor Called");
    }

    Constructor1(int a) {
        System.out.println("One-Argument Constructor Called with value: " + a);
    }

    Constructor1(int a, int b) {
        System.out.println("Two-Argument Constructor Called with values: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Constructor1 obj1 = new Constructor1();
        Constructor1 obj2 = new Constructor1(30);
        Constructor1 obj3 = new Constructor1(40, 20);
    }
}
