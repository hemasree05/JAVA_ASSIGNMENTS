interface DefaultInterface {
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

class DefaultClass implements DefaultInterface {}

public class Interface6{
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        obj.defaultMethod();
    }
}