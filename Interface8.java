interface PublicInterface {
    int VALUE = 100;  // Fields in interfaces are implicitly public, static, and final

    void show();
}

class PublicClass implements PublicInterface {
    public void show() {
        System.out.println("Value from interface: " + VALUE);
    }
}

public class Interface8 {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        obj.show();
    }
}