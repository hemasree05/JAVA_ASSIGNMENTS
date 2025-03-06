import java.util.Arrays;
public class Array16 {
    static int difference(int[] arr) {
        return Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 15};
        System.out.println("Difference: " + difference(arr));
    }
}