import java.util.Arrays;
public class Array8{
    static int[] findMinMax(int[] arr) {
        return new int[]{Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt()};
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 15};
        System.out.println("Min & Max: " + Arrays.toString(findMinMax(arr)));
    }
}