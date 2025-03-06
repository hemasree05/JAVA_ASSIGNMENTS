class Access1 {
    private String message = "Private Field";  

    private void displayMessage() {  
        System.out.println("Private Method: " + message);
    }

    public static void main(String[] args) {
        Access1 obj = new Access1();
        
        System.out.println("Private Field: " + obj.message);
        
        obj.displayMessage();
    }
}
