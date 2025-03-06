import java.io.*;
class Exp11 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception caught.");
        }
    }
}
