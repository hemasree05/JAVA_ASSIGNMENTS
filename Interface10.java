interface ValidInterface {
    int PUBLIC_VALUE = 55;  
    String MESSAGE = "Hello, Interface!";
    
    void display();
}

class ImplementingClass implements ValidInterface {
    @Override
    public void display() {
        System.out.println("Public Value: " + PUBLIC_VALUE);
        System.out.println("Message: " + MESSAGE);
    }
}

public class Interface10 {
    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.display();
    }
}