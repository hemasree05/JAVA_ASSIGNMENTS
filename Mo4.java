class Mo4 {
    void display(int a) {
        System.out.println("Method with int parameter: " + a);
    }

    void display(double a) {
        System.out.println("Method with double parameter: " + a);
    }

    public static void main(String[] args) {
        Mo4 obj = new Mo4();
        obj.display(20);
        obj.display(100.5);
    }
}
