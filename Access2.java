class DefaultExample {
    String message = "Default Field";  
    void displayMessage() {  
        System.out.println("Default Method: " + message);
    }
}
public class Access2 {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();  
        System.out.println("Accessing Default Field: " + obj.message);
        obj.displayMessage();
    }
}