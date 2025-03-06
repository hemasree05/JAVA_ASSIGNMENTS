import java.util.Arrays;
public class Array14 {
    static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Second Largest: " + secondLargest(arr));
    }
}