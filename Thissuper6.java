class Thissuper6 {
    void Thissuper6Method() {
        System.out.println("Thissuper6 class method");
    }
}

class Child extends Thissuper6 {
    void childMethod() {
        this.anotherChildMethod();
        super.Thissuper6Method();
    }

    void anotherChildMethod() {
        System.out.println("Another child class method");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.childMethod();
    }
}