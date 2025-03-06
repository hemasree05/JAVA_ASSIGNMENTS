import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class io8 {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("This is written using BufferedWriter!");
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
