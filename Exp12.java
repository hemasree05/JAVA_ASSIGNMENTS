import java.io.*;

class Exp12 {
    public static void main(String[] args) {
        try {
            throw new IOException("Custom IOException");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
