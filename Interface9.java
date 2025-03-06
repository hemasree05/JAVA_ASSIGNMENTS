interface PackagePrivateInterface {
    int VALUE = 55;
    void display();
}
class ImplementingClass implements PackagePrivateInterface {
    @Override
    public void display() {
        System.out.println("Value from Interface: " + VALUE);
    }
}
public class Interface9 {
    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.display();
    }
}