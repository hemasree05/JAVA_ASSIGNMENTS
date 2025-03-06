import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class io4 {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            String text = "This is written using BufferedOutputStream!";
            bos.write(text.getBytes());
            bos.flush();
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
