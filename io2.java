import java.io.FileOutputStream;
import java.io.IOException;

class io2 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String text = "Hello, this is written using OutputStream!";
            fos.write(text.getBytes());
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
