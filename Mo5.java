class Mo5 {
    int display(int a) {
        return a;
    }
    double display(int a) {
        return a * 10.0;
    }

    public static void main(String[] args) {
        Mo5 obj = new Mo5();
        System.out.println(obj.display(100));
    }
}
