class Constructor4 {
    int Constructor4() { 
        System.out.println("This is not a valid constructor");
        return 50;
    }

    String Constructor4(int a) { 
        System.out.println("This is also not a valid constructor");
        return "Error";
    }

    public static void main(String[] args) {
        Constructor4 obj = new Constructor4();
    }
}