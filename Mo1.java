class Mo1 {
    void display(int a) {
        System.out.println("Method with one parameter: " + a);
    }

    void display(int a, int b) {
        System.out.println("Method with two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Mo1 obj = new Mo1();
        obj.display(50);
        obj.display(90, 30);
    }
}
