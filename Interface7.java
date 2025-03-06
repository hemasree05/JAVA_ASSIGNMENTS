interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class InterfaceImpl implements ChildInterface {
    public void parentMethod() {
        System.out.println("Parent method implemented.");
    }

    public void childMethod() {
        System.out.println("Child method implemented.");
    }
}

public class Interface7{
    public static void main(String[] args) {
        InterfaceImpl obj = new InterfaceImpl();
        obj.parentMethod();
        obj.childMethod();
    }
}