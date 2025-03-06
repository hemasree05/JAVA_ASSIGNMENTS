import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class io9 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(fis);
            System.out.println("Database URL: " + prop.getProperty("db.url"));
            System.out.println("Username: " + prop.getProperty("db.user"));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
