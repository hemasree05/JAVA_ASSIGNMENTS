public class String11 {
    public static void main(String[] args) {
        String str = "Java,Python,C";
        String[] words = str.split(",");

        for (String word : words) {
            System.out.println(word);
        }
    }
}