class Constructor2 {
    Constructor2() {
        System.out.println("Constructor2 Default Constructor");
    }

    Constructor2(int a) {
        System.out.println("Constructor2 One-Argument Constructor: " + a);
    }
}

class Child extends Constructor2 {
    Child() {
        super(); 
        System.out.println("Child Default Constructor");
    }

    Child(int a) {
        super(a);
        System.out.println("Child One-Argument Constructor: " + a);
    }

    public static void main(String[] args) {
        Child obj1 = new Child();
        Child obj2 = new Child(500);
    }
}
