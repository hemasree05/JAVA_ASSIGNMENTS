public class Static5 {
    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    void callStaticMethod() {
        staticMethod1();
    }

    public static void main(String[] args) {
        Static5 obj = new Static5();
        obj.callStaticMethod();
    }
}