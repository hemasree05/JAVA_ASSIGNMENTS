import java.util.Arrays;
public class Array5 {
    static int[] removeElement(int[] arr, int key) {
        return Arrays.stream(arr).filter(n -> n != key).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeElement(arr, 3)));
    }
}