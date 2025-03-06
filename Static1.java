public class Static1 {
    //  Two Static Variables
    static int staticVar1 = 10;
    static String staticVar2 = "Static Variable";

    // Two Instance Variables
    int instanceVar1 = 20;
    String instanceVar2 = "Instance Variable";

    // Two Static Methods
    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    //  Two Instance Methods
    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    //  Main Method
    public static void main(String[] args) {
        Static1 obj = new Static1();

        // Printing static variables
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

        // Printing instance variables using the object
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);

        // Calling static methods
        staticMethod1();
        staticMethod2();

        // Calling instance methods using the object
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
