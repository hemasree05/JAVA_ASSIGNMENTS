interface TwoMethodsInterface {
    void methodOne();
    void methodTwo();
}

class PartialClass implements TwoMethodsInterface {
    public void methodOne() {
        System.out.println("Implemented methodOne in PartialClass.");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        PartialClass obj = new PartialClass();
        obj.methodOne();
    }
}