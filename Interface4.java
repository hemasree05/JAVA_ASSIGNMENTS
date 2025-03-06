interface FirstInterface {
    void firstMethod();
}

interface SecondInterface {
    void secondMethod();
}

class MultiClass implements FirstInterface, SecondInterface {
    public void firstMethod() {
        System.out.println("First method implemented.");
    }

    public void secondMethod() {
        System.out.println("Second method implemented.");
    }
}

public class Interface4 {
    public static void main(String[] args) {
        MultiClass obj = new MultiClass();
        obj.firstMethod();
        obj.secondMethod();
    }
}