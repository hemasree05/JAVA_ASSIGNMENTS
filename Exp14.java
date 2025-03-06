import java.lang.reflect.*;

class Exp14 {
    public static void main(String[] args) {
        try {
            Class<String> strClass = String.class;
            Method method = strClass.getMethod("nonexistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("No Such Method Exception caught.");
        }
    }
}
