class Mo3 {
    void display(int a) {
        System.out.println("Method 1: " + a);
    }
    void display(int b) {
        System.out.println("Method 2: " + b);
    }

    public static void main(String[] args) {
        Mo3 obj = new Mo3();
        obj.display(10);
    }
}
