public class Static7 {
    static void staticMethod1() {
        System.out.println("Static Method Called");
    }

    void instanceMethod1() {
        System.out.println("Instance Method Called");
    }

    public static void main(String[] args) {
        staticMethod1();  // Calling static method

        Static7 obj = new Static7();
        obj.instanceMethod1(); // Calling instance method
    }
}