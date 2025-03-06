class Mo2 {
    void display(int a) {
        System.out.println("Method with int parameter: " + a);
    }

    void display(double a) {
        System.out.println("Method with double parameter: " + a);
    }

    public static void main(String[] args) {
        Mo2 obj = new Mo2();
        obj.display(100);
        obj.display(22.5);
    }
}
