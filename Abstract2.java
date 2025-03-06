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
}
public class Abstract2{
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.nonAbstractMethod();
    }
}