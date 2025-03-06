interface MyInterface {
    void show();
}

class MyClass implements MyInterface {
    public void show() {
        System.out.println("Implemented method in MyClass.");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}
