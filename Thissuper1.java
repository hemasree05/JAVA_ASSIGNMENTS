class Thissuper1 {
    int num = 100;

    void display() {
        System.out.println("Value using 'this': " + this.num);
    }

    public static void main(String[] args) {
        Thissuper1 obj = new Thissuper1();
        obj.display();
    }
}