class PublicExample{
public String message = "Hello from Public Field";

    public void displayMessage() {
        System.out.println("Public Method: " + message);
    }
}
class SamePackageAccess {
    public void accessPublic() {
        PublicExample obj = new PublicExample();
        System.out.println("Same Package - Accessing Public Field: " + obj.message);
        obj.displayMessage();
    }
}
class AnotherPackageAccess {
    public void accessPublic() {
        PublicExample obj = new PublicExample();
        System.out.println("Different Package - Accessing Public Field: " + obj.message);
        obj.displayMessage();
    }
}
// Main class
public class Access4 {
    public static void main(String[] args) {
        SamePackageAccess samePkg = new SamePackageAccess();
        samePkg.accessPublic();

        AnotherPackageAccess anotherPkg = new AnotherPackageAccess();
        anotherPkg.accessPublic();
    }
}
