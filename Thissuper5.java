class Thissuper5 {
    Thissuper5() {
        System.out.println("Thissuper5 class constructor called");
    }
}

class Child extends Thissuper5 {
    Child() {
        super();
        System.out.println("Child class constructor called");
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}