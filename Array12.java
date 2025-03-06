import java.util.Arrays;
import java.util.LinkedHashSet;
public class Array12 {
    static int[] removeDuplicates(int[] arr) {
        return new LinkedHashSet<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)))
                .stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
