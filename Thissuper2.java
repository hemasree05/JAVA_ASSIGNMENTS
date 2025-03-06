class Thissuper2 {
    int parentNumber = 100;
}

class Child extends Thissuper2 {
    int childNumber = 500;

    void display() {
        System.out.println("Child number: " + this.childNumber);
        System.out.println("Thissuper2 number using 'super': " + super.parentNumber);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}