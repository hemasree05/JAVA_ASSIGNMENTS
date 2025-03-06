import java.util.Arrays;

public class Array13 {
    static int secondLargest(int[] arr) {
        return Arrays.stream(arr).distinct().sorted().toArray()[arr.length - 2];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Second Largest: " + secondLargest(arr));
    }
}