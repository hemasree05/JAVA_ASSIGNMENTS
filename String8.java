public class String8 {
    public static void main(String[] args) {
        String str = "Jala Tech";

        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase("jala tech")); 
        System.out.println("Starts with 'Jala'? " + str.startsWith("Jala")); 
        System.out.println("Ends with 'Tech'? " + str.endsWith("Tech")); 
        System.out.println("CompareTo 'Jala': " + str.compareTo("Jala")); 
    }
}