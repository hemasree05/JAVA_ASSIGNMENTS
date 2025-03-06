class VarScope {
    int n = 100;

    void display() {
        int n = 200;
        System.out.println(n);
        System.out.println(this.n);
    }

    public static void main(String[] args) {
        VarScope obj = new VarScope();
        obj.display();
    }
}
