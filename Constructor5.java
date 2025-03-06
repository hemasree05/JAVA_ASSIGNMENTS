class Constructor5 {
    Constructor5() {
        System.out.println("Constructor Called");
    }

    void callConstructor() {
        System.out.println("Method Calling Constructor - Not Allowed in Java");
    }
    public static void main(String[] args) {
        Constructor5 obj = new Constructor5();
        obj.callConstructor();
    }
}