class Thissuper3 {
    Thissuper3() {
        this(100);  
        System.out.println("Default constructor called");
    }

    Thissuper3(int num) {
        System.out.println("Parameterized constructor called with value: " + num);
    }

    public static void main(String[] args) {
        Thissuper3 obj = new Thissuper3();
    }
}