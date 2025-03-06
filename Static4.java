public class Static4 {
    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    static void callInstanceMethod() {
        Static4 obj = new Static4();
        obj.instanceMethod1();
    }

    public static void main(String[] args) {
        callInstanceMethod();
    }
}