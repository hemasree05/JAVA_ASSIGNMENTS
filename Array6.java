import java.util.Arrays;

public class Array6 {
    static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(Arrays.toString(copyArray(arr)));
    }
}