abstract class AbstractExample {
    abstract void abstractMethod();
}
class SubClass extends AbstractExample {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in SubClass.");
    }
}
public class Abstract3 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.abstractMethod();
    }
}