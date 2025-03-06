import java.lang.reflect.*;

class Exp13 {
    public static void main(String[] args) {
        try {
            Class<String> strClass = String.class;
            Field field = strClass.getDeclaredField("nonexistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("No Such Field Exception caught.");
        }
    }
}
