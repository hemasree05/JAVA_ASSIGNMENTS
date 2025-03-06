class Constructor3 {
    private Constructor3() {
        System.out.println("Private Constructor Called");
    }

    protected Constructor3(int a) {
        System.out.println("Protected Constructor Called with value: " + a);
    }

    public Constructor3(String str) {
        System.out.println("Public Constructor Called with value: " + str);
    }

    Constructor3(double d) {
        System.out.println("Default (Package-Private) Constructor Called with value: " + d);
    }

    public static void main(String[] args) {
        Constructor3 obj1 = new Constructor3();
        Constructor3 obj2 = new Constructor3(100);
        Constructor3 obj3 = new Constructor3("Hello Jala Tech");
        Constructor3 obj4 = new Constructor3(50.5);
    }
}

