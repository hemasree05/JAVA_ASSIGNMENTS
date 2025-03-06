import java.util.Arrays;
import java.util.Collections;

public class Array9 {
    static Integer[] reverseArray(Integer[] arr) {
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}