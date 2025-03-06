abstract class AbstractExample {
    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method from AbstractExample.");
    }
}
class SubClass extends AbstractExample {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in SubClass.");
    }

    void callMethods() {
        System.out.println("Calling methods inside SubClass:");
        nonAbstractMethod();  // Calling non-abstract method
        abstractMethod();     // Calling abstract method
    }
}

public class Abstract4 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.callMethods();
    }
}