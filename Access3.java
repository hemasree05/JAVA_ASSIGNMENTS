class ProtectedExample {
    protected String message = "Hello from Protected Field";
    protected void displayMessage() {
        System.out.println("Protected Method: " + message);
    }
}

class SamePackageAccess {
    public void accessProtected() {
        ProtectedExample obj = new ProtectedExample();
        System.out.println("Same Package - Accessing Protected Field: " + obj.message);
        obj.displayMessage();
    }
}

class ChildClass extends ProtectedExample {
    public void accessParentMethod() {
        System.out.println("Child Class - Accessing Protected Field: " + message);
        displayMessage();
    }
}

// Main class
public class Access3 {
    public static void main(String[] args) {
        SamePackageAccess samePkg = new SamePackageAccess();
        samePkg.accessProtected();

        ChildClass child = new ChildClass();
        child.accessParentMethod();
    }
}
