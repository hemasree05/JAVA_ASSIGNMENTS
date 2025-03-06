class A {
    int data = 10; // Instance variable

    // Specific methods of A
    void methodA1() {
        System.out.println("Method A1 from Class A");
    }

    void methodA2() {
        System.out.println("Method A2 from Class A");
    }

    // Overridden method
    void commonMethod() {
        System.out.println("Common Method from Class A");
    }
}

// Subclass B (inherits A)
class B extends A {
    int data = 20; // Instance variable

    // Specific methods of B
    void methodB1() {
        System.out.println("Method B1 from Class B");
    }

    void methodB2() {
        System.out.println("Method B2 from Class B");
    }

    // Overridden method
    @Override
    void commonMethod() {
        System.out.println("Common Method from Class B");
    }
}

// Subclass C (inherits B)
class C extends B {
    int data = 30; // Instance variable

    // Specific methods of C
    void methodC1() {
        System.out.println("Method C1 from Class C");
    }

    void methodC2() {
        System.out.println("Method C2 from Class C");
    }

    // Overridden method
    @Override
    void commonMethod() {
        System.out.println("Common Method from Class C");
    }
}

// Main class to test the implementation
public class Inheritance{
    public static void main(String[] args) {
        // Creating objects for each class
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // Calling all methods using respective objects
        System.out.println("\n--- Calling Methods Using Own Objects ---");
        objA.methodA1();
        objA.methodA2();
        objA.commonMethod(); // Calls A's commonMethod

        objB.methodA1(); // Inherited from A
        objB.methodA2(); // Inherited from A
        objB.methodB1();
        objB.methodB2();
        objB.commonMethod(); // Calls B's overridden commonMethod

        objC.methodA1(); 
        objC.methodA2(); 
        objC.methodB1(); 
        objC.methodB2(); 
        objC.methodC1();
        objC.methodC2();
        objC.commonMethod(); // Calls C's overridden commonMethod

        // Runtime Polymorphism: Calling overridden method using superclass reference
        System.out.println("\n--- Overridden Method Call Using Superclass Reference ---");
        A ref1 = new B();
        A ref2 = new C();

        ref1.commonMethod(); // Calls B's commonMethod
        ref2.commonMethod(); // Calls C's commonMethod

        // Runtime Polymorphism with Data Members
        System.out.println("\n--- Runtime Polymorphism with Data Members ---");
        System.out.println("Value of data in A: " + objA.data);
        System.out.println("Value of data in B: " + objB.data);
        System.out.println("Value of data in C: " + objC.data);

        A ref3 = new B();
        A ref4 = new C();
        System.out.println("Value of data with reference A (holding B object): " + ref3.data);
        System.out.println("Value of data with reference A (holding C object): " + ref4.data);
    }
}
